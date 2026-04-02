import java.util.Scanner;
 
class RestaurantManagement
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     int choice;
     char more;
     double total = 0;
  
     do{
         System.out.println("------------Menu------------");
          System.out.println("1. Pizza      - 200");
          System.out.println("2. Burger     - 100");
          System.out.println("3. Pasta      - 150");
          System.out.println("4. Cold Drink - 50");

          System.out.println("Enter your choice: ");
           choice = sc.nextInt();

           System.out.println("Enter quantity: ");
            int qty = sc.nextInt();

           switch(choice)
           {
              case 1:
                    total += 200 * qty;
                    break;
              case 2:
                     total +=100 * qty;
                     break;
               case 3:
                    total += 150 * qty;
                    break;
                case 4:
                    total += 50 * qty;
                    break;
                 default:
                     System.out.println("Invalid choice!");
            }
              System.out.print("Do you want to order more? (y/n): ");
              more = sc.next().charAt(0);

        } while (more == 'y' || more == 'Y');
         
         double gst = total * 0.05;
         double finalAmount = total + gst;

        System.out.println("\n----- FINAL BILL -----");
        System.out.println("Total Amount: " + total);
        System.out.println("GST (5%): " + gst);
        System.out.println("Final Amount: " + finalAmount);

     }
}
















          