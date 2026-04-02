import java.util.Scanner;

class Atm{
 
private double balance;
  
  Atm(double balance){

    this.balance = balance;
  }
  double getBalance(){
    return balance;
   }
   
   void setBalance(double balance){
       if(balance >= 0){
           this.balance = balance;
        }
       else{
         System.out.println("Invalid balance");
       }
     }
  
      void checkBalance(){
          System.out.println("Current Balance: " + balance);
       }

       void deposit(double amount){
            if(amount > 0){
              balance += amount;
             System.out.println("Amount deposited successful");
             }
              else{
             System.out.println("Invalid Amount");
              }
           }

          void withdraw(double amount){
            if(amount > 0 && amount <= balance){
              balance -= amount;
             System.out.println("Please collect your cash");
             }
              else{
             System.out.println("Insufficient balance or invalid amount");
              }
            }
        }
   class AtmSystem{

        public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        

          Atm atm = new Atm(1000.0);

          int choice;
          double amount;

         do{
 
              System.out.println("\n=====ATM MENU=======");
              System.out.println("1. Check Balance");
              System.out.println("2.Deposit Money");
              System.out.println("3. Withdraw Money");
              System.out.println("4.Exit");
             System.out.println("Enter your choice: ");

               choice = sc.nextInt();


             switch(choice) {
     
              case 1:
                   atm.checkBalance();
                    break;
 
               case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    atm.deposit(amount);
                    break;
               case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    atm.withdraw(amount);
                     break;

                 case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
 
                  default:
                     System.out.println("Invalid choice");
                  }

                   } while(choice !=4);
               }
       }

          