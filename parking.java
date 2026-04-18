import java.util.*;

class User {
    int userId;
    String name;
    String phoneNo;
    List<Integer> parkedSlots; // list of slotIds

    User(int id, String name, String phoneNo) {
        this.userId = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.parkedSlots = new ArrayList<>();
    }

    void parkAt(int slotId) {
        parkedSlots.add(slotId);
    }

    void leaveSlot(int slotId) {
        parkedSlots.remove(Integer.valueOf(slotId));
    }

    public String toString() {
        return "User{id=" + userId + ", name='" + name + "', slots=" + parkedSlots + "}";
    }
}

class Vehicle {
    int vehicleId;
    String numberPlate;
    String vehicleType;

    Vehicle(int id, String numberPlate, String vehicleType) {
        this.vehicleId = id;
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }

    public String toString() {
        return "Vehicle{id=" + vehicleId + ", plate='" + numberPlate + "', type='" + vehicleType + "'}";
    }
}

class ParkingSlot {
    int slotId;
    String location;
    String status;
    Sensor sensor;
    Vehicle currentVehicle;

    ParkingSlot(int id, String location, Sensor sensor) {
        this.slotId = id;
        this.location = location;
        this.sensor = sensor;
        this.currentVehicle = null;
        this.status = "FREE";
    }

    boolean isAvailable() {
        return "FREE".equals(status) && currentVehicle == null;
    }

    void parkVehicle(Vehicle v) {
        if (isAvailable()) {
            currentVehicle = v;
            sensor.updateStatus("OCCUPIED");
            status = "OCCUPIED";
        }
    }

    void leave() {
        currentVehicle = null;
        sensor.updateStatus("FREE");
        status = "FREE";
    }

    public String toString() {
        return "Slot{id=" + slotId + ", loc='" + location + "', status=" + status + ", vehicle=" + (currentVehicle != null ? currentVehicle.toString() : "empty") + "}";
    }
}

class ParkingArea {
    int areaId;
    String areaName;
    int capacity;
    List<ParkingSlot> slots;

    ParkingArea(int id, String areaName, int capacity) {
        this.areaId = id;
        this.areaName = areaName;
        this.capacity = capacity;
        this.slots = new ArrayList<>();
    }

    void addSlot(ParkingSlot slot) {
        if (slots.size() < capacity) {
            slots.add(slot);
        }
    }

    void viewSlots() {
        System.out.println("\n--- Slots in " + areaName + " (capacity: " + capacity + ") ---");
        for (ParkingSlot slot : slots) {
            System.out.println(slot);
        }
    }

    ParkingSlot getSlot(int slotId) {
        for (ParkingSlot slot : slots) {
            if (slot.slotId == slotId) return slot;
        }
        return null;
    }
}

class Sensor {
    int sensorId;
    String sensorType;
    String status;
    String date;

    Sensor(int id, String sensorType, String status, String date) {
        this.sensorId = id;
        this.sensorType = sensorType;
        this.status = status;
        this.date = date;
    }

    void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    boolean isFree() {
        return "FREE".equals(status);
    }

    public String toString() {
        return "Sensor{id=" + sensorId + ", type='" + sensorType + "', status='" + status + "', date='" + date + "'}";
    }
}

class ParkingSystem {
    Map<Integer, ParkingArea> areas;
    Map<Integer, User> users;
    Map<Integer, Vehicle> vehicles;

    ParkingSystem() {
        areas = new HashMap<>();
        users = new HashMap<>();
        vehicles = new HashMap<>();
        initDemoData();
    }

    void initDemoData() {
        // Demo Area 1
        ParkingArea area1 = new ParkingArea(1, "Downtown", 3);
        Sensor s1 = new Sensor(101, "ULTRASONIC", "FREE", "2024-01-01");
        area1.addSlot(new ParkingSlot(1, "Level1-A", s1));
        Sensor s2 = new Sensor(102, "INFRARED", "FREE", "2024-01-01");
        area1.addSlot(new ParkingSlot(2, "Level1-B", s2));
        areas.put(1, area1);

        // Demo Area 2
        ParkingArea area2 = new ParkingArea(2, "Mall", 2);
        Sensor s3 = new Sensor(103, "ULTRASONIC", "FREE", "2024-01-01");
        area2.addSlot(new ParkingSlot(3, "Basement-A", s3));
        areas.put(2, area2);
    }

    void listAreas() {
        System.out.println("\n--- Parking Areas ---");
        areas.values().forEach(area -> System.out.println("ID:" + area.areaId + " - " + area.areaName));
    }

    void bookParking(int areaId, int slotId, int userId, int vehicleId) {
        ParkingArea area = areas.get(areaId);
        if (area == null) {
            System.out.println("Area not found!");
            return;
        }
        ParkingSlot slot = area.getSlot(slotId);
        if (slot == null || !slot.isAvailable()) {
            System.out.println("Slot not available!");
            return;
        }
        Vehicle v = vehicles.computeIfAbsent(vehicleId, k -> new Vehicle(vehicleId, "PLATE" + vehicleId, "CAR"));
        User u = users.computeIfAbsent(userId, k -> new User(userId, "User" + userId, "555-" + userId));
        slot.parkVehicle(v);
        u.parkAt(slotId);
        System.out.println("Booked: Vehicle " + v + " at Area" + areaId + "-Slot" + slotId + " for " + u.name);
    }

    void leaveParking(int areaId, int slotId) {
        ParkingArea area = areas.get(areaId);
        if (area == null) return;
        ParkingSlot slot = area.getSlot(slotId);
        if (slot != null && slot.currentVehicle != null) {
            slot.leave();
            System.out.println("Left: Area" + areaId + "-Slot" + slotId);
        } else {
            System.out.println("Slot empty!");
        }
    }

    void viewAreaSlots(int areaId) {
        ParkingArea area = areas.get(areaId);
        if (area != null) {
            area.viewSlots();
        } else {
            System.out.println("Area not found!");
        }
    }

    void viewUserParkings(int userId) {
        User u = users.get(userId);
        if (u == null || u.parkedSlots.isEmpty()) {
            System.out.println("No parkings for User " + userId);
            return;
        }
        System.out.println("\nParkings for " + u.name + ":");
        for (int slotId : u.parkedSlots) {
            // Simple print (can enhance to find exact slot)
            System.out.println("  Slot " + slotId + " (check areas)");
        }
    }
}

public class parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingSystem system = new ParkingSystem();
        System.out.println("=== Urban Smart Parking Sensor System ===");

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. List Areas");
            System.out.println("2. View Area Slots (areaId)");
            System.out.println("3. Book Parking (areaId slotId userId vehicleId)");
            System.out.println("4. Leave Parking (areaId slotId)");
            System.out.println("5. View User Parkings (userId)");
            System.out.println("0. Exit");

            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();

            if (choice.equals("0")) break;

            try {
                int opt = Integer.parseInt(choice);
                switch (opt) {
                    case 1:
                        system.listAreas();
                        break;
                    case 2:
                        System.out.print("Area ID: ");
                        system.viewAreaSlots(Integer.parseInt(sc.nextLine().trim()));
                        break;
                    case 3:
                        System.out.print("Area ID: "); int a = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Slot ID: "); int s = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("User ID: "); int u = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Vehicle ID: "); int v = Integer.parseInt(sc.nextLine().trim());
                        system.bookParking(a, s, u, v);
                        break;
                    case 4:
                        System.out.print("Area ID: "); int la = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Slot ID: "); int ls = Integer.parseInt(sc.nextLine().trim());
                        system.leaveParking(la, ls);
                        break;
                    case 5:
                        System.out.print("User ID: ");
                        system.viewUserParkings(Integer.parseInt(sc.nextLine().trim()));
                        break;
                    default: System.out.println("Invalid!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
        sc.close();
        System.out.println("System closed.");
    }
}
