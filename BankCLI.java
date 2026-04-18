import java.util.*;

// ---------------- CUSTOMER ----------------
class Customer {

    int customerId;
    String name;
    String phone;

    Customer(int id, String name, String phone) {

        this.customerId = id;
        this.name = name;
        this.phone = phone;
    }

    void display() {

        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("---------------------");
    }
}


// ---------------- ACCOUNT ----------------
class Account {

    int accountId;
    String type;
    double balance;
    int customerId;

    Account(int id, String type, double balance, int custId) {

        this.accountId = id;
        this.type = type;
        this.balance = balance;
        this.customerId = custId;
    }

    void deposit(double amt) {

        balance = balance + amt;

        System.out.println("Deposited: " + amt);
        System.out.println("Remaining Balance: " + balance);
    }

    void withdraw(double amt) {

        if(balance >= amt) {

            balance = balance - amt;

            System.out.println("Withdrawn: " + amt);
            System.out.println("Remaining Balance: " + balance);
        }
        else {

            System.out.println("Insufficient Balance");
            System.out.println("Current Balance: " + balance);
        }
    }

    void display() {

        System.out.println("Account No: " + accountId);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
        System.out.println("Customer ID: " + customerId);
        System.out.println("---------------------");
    }
}


// ---------------- LOAN ----------------
class Loan {

    int loanId;
    double amount;
    int customerId;

    Loan(int loanId, double amount, int custId) {

        this.loanId = loanId;
        this.amount = amount;
        this.customerId = custId;
    }

    void display() {

        System.out.println("Loan ID: " + loanId);
        System.out.println("Amount: " + amount);
        System.out.println("Customer ID: " + customerId);
        System.out.println("---------------------");
    }
}


// ---------------- CARD ----------------
class Card {

    int cardId;
    int accountId;
    String type;

    Card(int id, int accId, String type) {

        this.cardId = id;
        this.accountId = accId;
        this.type = type;
    }

    void display() {

        System.out.println("Card ID: " + cardId);
        System.out.println("Account ID: " + accountId);
        System.out.println("Card Type: " + type);
        System.out.println("---------------------");
    }
}


// ---------------- TRANSACTION ----------------
class Transaction {

    int transId;
    int senderAcc;
    int receiverAcc;
    double amount;

    Transaction(int id, int s, int r, double amt) {

        transId = id;
        senderAcc = s;
        receiverAcc = r;
        amount = amt;
    }

    void display() {

        System.out.println("Transaction ID: " + transId);
        System.out.println("From Account: " + senderAcc);
        System.out.println("To Account: " + receiverAcc);
        System.out.println("Amount: " + amount);
        System.out.println("---------------------");
    }
}



// ---------------- MAIN CLASS ----------------
public class BankCLI {

    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static ArrayList<Card> cards = new ArrayList<>();
    static ArrayList<Transaction> transactions = new ArrayList<>();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== BANK MENU =====");

            System.out.println("1 Add Customer");
            System.out.println("2 Create Account");
            System.out.println("3 Deposit");
            System.out.println("4 Withdraw");
            System.out.println("5 Transfer Money");
            System.out.println("6 Apply Loan");
            System.out.println("7 Create Card");
            System.out.println("8 View Customers");
            System.out.println("9 View Accounts");
            System.out.println("10 View Transactions");
            System.out.println("11 Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();


            switch(choice) {


                // ADD CUSTOMER
                case 1:

                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    Customer c = new Customer(cid, name, phone);

                    customers.add(c);

                    System.out.println("Customer Added");

                    break;



                // CREATE ACCOUNT
                case 2:

                    System.out.print("Enter Account No: ");
                    int accId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Type: ");
                    String type = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();

                    Account a = new Account(accId, type, bal, custId);

                    accounts.add(a);

                    System.out.println("Account Created");

                    break;



                // DEPOSIT
                case 3:

                    System.out.print("Enter Account No: ");
                    accId = sc.nextInt();

                    for(Account acc : accounts) {

                        if(acc.accountId == accId) {

                            System.out.print("Enter Deposit Amount: ");

                            double amt = sc.nextDouble();

                            acc.deposit(amt);
                        }
                    }

                    break;



                // WITHDRAW
                case 4:

                    System.out.print("Enter Account No: ");
                    accId = sc.nextInt();

                    for(Account acc : accounts) {

                        if(acc.accountId == accId) {

                            System.out.print("Enter Withdraw Amount: ");

                            double amt = sc.nextDouble();

                            acc.withdraw(amt);
                        }
                    }

                    break;



                // TRANSFER
                case 5:

                    System.out.print("Sender Account No: ");
                    int s = sc.nextInt();

                    System.out.print("Receiver Account No: ");
                    int r = sc.nextInt();

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();


                    for(Account acc : accounts) {

                        if(acc.accountId == s) {

                            acc.withdraw(amt);
                        }

                        if(acc.accountId == r) {

                            acc.deposit(amt);
                        }
                    }


                    Transaction t = new Transaction(
                            transactions.size()+1, s, r, amt
                    );

                    transactions.add(t);

                    System.out.println("Transfer Successful");

                    break;



                // APPLY LOAN
                case 6:

                    System.out.print("Loan ID: ");
                    int lid = sc.nextInt();

                    System.out.print("Loan Amount: ");
                    double lamt = sc.nextDouble();

                    System.out.print("Customer ID: ");
                    custId = sc.nextInt();


                    Loan l = new Loan(lid, lamt, custId);

                    loans.add(l);

                    System.out.println("Loan Applied");

                    break;



                // CREATE CARD
                case 7:

                    System.out.print("Card ID: ");
                    int cardId = sc.nextInt();

                    System.out.print("Account No: ");
                    accId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Card Type: ");
                    type = sc.nextLine();


                    Card c1 = new Card(cardId, accId, type);

                    cards.add(c1);

                    System.out.println("Card Created");

                    break;



                // VIEW CUSTOMERS
                case 8:

                    for(Customer cust : customers) {

                        cust.display();
                    }

                    break;



                // VIEW ACCOUNTS
                case 9:

                    for(Account acc : accounts) {

                        acc.display();
                    }

                    break;



                // VIEW TRANSACTIONS
                case 10:

                    for(Transaction tr : transactions) {

                        tr.display();
                    }

                    break;



                // EXIT
                case 11:

                    System.out.println("Thank You");

                    return;



                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}