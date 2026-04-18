import java.util.*;
class Customer{
    int cust_id;
    String cust_name;
    String phone_no;
    String mail_id;
    String address;
    Customer(int id, String name, String phone_no, String mail_id, String address){
        this.cust_id=id;
        this.cust_name=name;
        this.phone_no=phone_no;
        this.mail_id=mail_id;
        this.address=address;
    }
    void display(){
        System.out.println("Customer ID: "+cust_id);
        System.out.println("Customer Name: "+cust_name);
        System.out.println("Phone No: "+phone_no);
        System.out.println("Mail ID: "+mail_id);
        System.out.println("Address: "+address);
    }
}
class Product{
    int product_id;
    String product_name;
    double price;
    int quantity;
    int stock;
    String expiry_date;
    Product(int id, String name, double price, int quantity, int stock, String expiry_date){
        this.product_id=id;
        this.product_name=name;
        this.price=price;
        this.quantity=quantity;
        this.stock=stock;
        this.expiry_date=expiry_date;
    }
    void display(){
        System.out.println("Product ID: "+product_id);
        System.out.println("Product Name: "+product_name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Stock: "+stock);
        System.out.println("Expiry Date: "+expiry_date);
    }
}
class Invoice{
    
}