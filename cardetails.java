import java.util.Scanner;
class Car {
    private String make;
    private String model;
    private double price;
    private int year;
    public Car() {
    }
     public void getDetails(Scanner scanner) {
        System.out.print("Enter car make: ");
        this.make = scanner.nextLine();
        System.out.print("Enter car model: ");
        this.model = scanner.nextLine();
        System.out.print("Enter the  car price: ");
        this.price = scanner.nextDouble();
        System.out.print("Enter car year: ");
        this.year = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
    }
     public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model " + model);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
public class Cardetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            cars[i] = new Car();
            cars[i].getDetails(scanner);
            System.out.println();
        }
        System.out.println("Car Details Entered:");
        for (Car car : cars) {
            car.displayDetails();
        }

    }
}
