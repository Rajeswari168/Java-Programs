import java.util.*;
class User {
    int user_id;
    String name;
    String phone_no;
    User(int id, String name, String phone_no) {
        this.user_id = id;
        this.name = name;
        this.phone_no = phone_no;
    }
    void display() {
        System.out.println("User ID: " + user_id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone_no);
    }
}
class Vehicle {
    int vehicle_id;
    String number_plate;
    String vehicle_type;
    int assigned_slot = -1;
    Vehicle(int id, String number_plate, String vehicle_type) {
        this.vehicle_id = id;
        this.number_plate = number_plate;
        this.vehicle_type = vehicle_type;
    }
    void display() {
        System.out.println("Vehicle ID: " + vehicle_id);
        System.out.println("Number Plate: " + number_plate);
        System.out.println("Type: " + vehicle_type);
        System.out.println("Assigned Slot: " + (assigned_slot == -1 ? "None" : assigned_slot));
    }
}
class ParkingSlot {
    int slot_id;
    String location;
    String status;
    ParkingSlot(int id, String location) {
        this.slot_id = id;
        this.location = location;
        this.status = "Available";
    }
    void display() {
        System.out.println("Slot ID: " + slot_id);
        System.out.println("Location: " + location);
        System.out.println("Status: " + status);
    }
}
class ParkingArea {
    int area_id;
    String area_name;
    int capacity;
    ParkingArea(int id, String name, int capacity) {
        this.area_id = id;
        this.area_name = name;
        this.capacity = capacity;
    }
    void display() {
        System.out.println("Area ID: " + area_id);
        System.out.println("Area Name: " + area_name);
        System.out.println("Capacity: " + capacity);
    }
}
class Sensor {
    int sensor_id;
    String sensor_type;
    String status;
    String date;
    Sensor(int id, String type, String status, String date) {
        this.sensor_id = id;
        this.sensor_type = type;
        this.status = status;
        this.date = date;
    }
    void display() {
        System.out.println("Sensor ID: " + sensor_id);
        System.out.println("Sensor Type: " + sensor_type);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date);
    }
}
public class Parkingsystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<ParkingSlot> slots = new ArrayList<>();
        ArrayList<ParkingArea> areas = new ArrayList<>();
        ArrayList<Sensor> sensors = new ArrayList<>();

        while (true) {

            System.out.println("\nUrban Smart Parking Sensor System");
            System.out.println("1. Add User");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Add Parking Area");
            System.out.println("4. Add Parking Slot");
            System.out.println("5. Add Sensor");
            System.out.println("6. Assign Slot to Vehicle");
            System.out.println("7. Release Slot");
            System.out.println("8. View All Details");
            System.out.println("9. Show Available Slots");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    User us=new User(uid,uname,phone);
                    users.add(us);
                    System.out.println("User Added!");
                    break;

                case 2:
                    System.out.print("Enter Vehicle ID: ");
                    int vid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Number Plate: ");
                    String plate = sc.nextLine();

                    System.out.print("Enter Vehicle Type: ");
                    String vtype = sc.nextLine();
                    Vehicle ve=new Vehicle(vid, plate, vtype);
                    vehicles.add(ve);
                    System.out.println("Vehicle Added!");
                    break;

                case 3:
                    System.out.print("Enter Area ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Area Name: ");
                    String aname = sc.nextLine();

                    System.out.print("Enter Capacity: ");
                    int cap = sc.nextInt();
                    ParkingArea ar=new ParkingArea(aid, aname, cap);
                    areas.add(ar);
                    System.out.println("Parking Area Added!");
                    break;

                case 4:
                    System.out.print("Enter Slot ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Location: ");
                    String loc = sc.nextLine();
                    ParkingSlot slo=new ParkingSlot(sid, loc);
                    slots.add(slo);
                    System.out.println("Parking Slot Added!");
                    break;

                case 5:
                    System.out.print("Enter Sensor ID: ");
                    int seid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Sensor Type: ");
                    String stype = sc.nextLine();

                    System.out.print("Enter Status: ");
                    String sstatus = sc.nextLine();

                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    Sensor sens=new Sensor(seid, stype, sstatus, date);
                    sensors.add(sens);
                    System.out.println("Sensor Added!");
                    break;

                case 6:
                    System.out.print("Enter Vehicle ID: ");
                    int v_id = sc.nextInt();

                    System.out.print("Enter Slot ID: ");
                    int slot_id = sc.nextInt();

                    for (Vehicle v : vehicles) {
                        if (v.vehicle_id == v_id) {

                            for (ParkingSlot s : slots) {
                                if (s.slot_id == slot_id && s.status.equals("Available")) {

                                    s.status = "Occupied";
                                    v.assigned_slot = slot_id;

                                    System.out.println("Slot Assigned Successfully!");
                                }
                            }
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter Vehicle ID: ");
                    int rel_vid = sc.nextInt();

                    for (Vehicle v : vehicles) {
                        if (v.vehicle_id == rel_vid && v.assigned_slot != -1) {

                            for (ParkingSlot s : slots) {
                                if (s.slot_id == v.assigned_slot) {

                                    s.status = "Available";
                                    v.assigned_slot = -1;

                                    System.out.println("Slot Released!");
                                }
                            }
                        }
                    }
                    break;

                case 8:

                    System.out.println("\nUSERS");
                    for (User u : users) {
                        u.display();
                        System.out.println();
                    }

                    System.out.println("\nVEHICLES");
                    for (Vehicle v : vehicles) {
                        v.display();
                        System.out.println();
                    }

                    System.out.println("\nAREAS");
                    for (ParkingArea a : areas) {
                        a.display();
                        System.out.println();
                    }

                    System.out.println("\nSLOTS");
                    for (ParkingSlot s : slots) {
                        s.display();
                        System.out.println();
                    }

                    System.out.println("\nSENSORS");
                    for (Sensor se : sensors) {
                        se.display();
                        System.out.println();
                    }

                    break;

                case 9:

                    System.out.println("\nAvailable Slots:");

                    for (ParkingSlot s : slots) {
                        if (s.status.equals("Available")) {
                            s.display();
                            System.out.println();
                        }
                    }

                    break;

                case 10:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}