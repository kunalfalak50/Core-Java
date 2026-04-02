class BankDemo
{
   int accountNumber;
    String name;
    double balance;
  
    BankDemo(){
      accountNumber = 0;
      name = "Not Assigned";
      balance = 0.0;
     }

      BankDemo(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }
}

class BankAccount{
    public static void main(String[] args) {

        // Object using default constructor
        BankDemo acc1 = new BankDemo();

        // Objects using parameterized constructor
        BankDemo acc2 = new BankDemo(101, "Kunal", 5000.50);
        BankDemo acc3 = new BankDemo(102, "Rahul", 10000.75);

        // Display details
        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();
    }
}