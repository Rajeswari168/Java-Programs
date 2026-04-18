public class Item {
  
    private String name;
    private double price;

   
    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

  
    public void sellItem(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += price * quantity;
    }

   
    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

   
    public static double getTotalRevenue() {
        return totalRevenue;
    }

   
    public static void main(String[] args) {
       
        Item laptop = new Item("Laptop", 1000.0);
        laptop.sellItem(2);
        System.out.println("Test Case 1:");
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold()); 

        System.out.println("Total Revenue: $" + Item.getTotalRevenue());    

      
        totalItemsSold = 0;
        totalRevenue = 0.0;

       
        laptop = new Item("Laptop", 1000.0);
        Item smartphone = new Item("Smartphone", 500.0);
        laptop.sellItem(3);  // Sell 3 laptops
        smartphone.sellItem(5); // Sell 5 smartphones
        System.out.println("\nTest Case 2:");
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());   

        
        totalItemsSold = 0;
        totalRevenue = 0.0;

      
        laptop = new Item("Laptop", 1000.0);
        System.out.println("\nTest Case 3:");
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold()); 
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());   
       
        laptop = new Item("Laptop", 1000.0);
        smartphone = new Item("Smartphone", 500.0);
        laptop.sellItem(1);  // Sell 1 laptop
        smartphone.sellItem(4); // Sell 4 smartphones
        System.out.println("\nTest Case 4:");
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold()); 
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());   

       
        totalItemsSold = 0;
        totalRevenue = 0.0;

       
        laptop = new Item("Laptop", 1000.0);
        laptop.sellItem(100); 
        System.out.println("\nTest Case 5:");
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
       System.out.println("Total Revenue: $" + Item.getTotalRevenue());    
    }
}
