import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private double price;
    private int copies;
    public Book() {
    }
     public void getDetails(Scanner scanner) {
        System.out.print("Enter book title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter book author: ");
        this.author = scanner.nextLine();
        System.out.print("Enter book price: ");
        this.price = scanner.nextDouble();
        System.out.print("Enter number of copies: ");
        this.copies = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
    }
     public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Copies: " + copies);
        System.out.println();
    }
}
public class BookstoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = new Book();
            books[i].getDetails(scanner);
            System.out.println();
        }
        System.out.println("Book Details Entered:");
        for (Book book : books) {
            book.displayDetails();
        }

    }
}
