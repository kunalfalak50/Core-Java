import java.util.Scanner;
 
class ExpenseTracker
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      
        double[] expenses = new double[7];
        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
         double total = 0;
         double max =0;
         double min;
         int maxDayIndex = 0;
  
         for(int i = 0; i < 7; i++)
         {
           System.out.println("Enter expense for " +days[i] + " : ");
            expenses[i] = sc.nextDouble();

             total += expenses[i];
        
             if(expenses[i] > max)
             {
              max = expenses[i];
              maxDayIndex = i;
              }
            }

            //initialize min after input
           min = expenses[0];


            //find minimum 
           for (int i = 1; i < 7; i++) {
            if (expenses[i] < min) {
                min = expenses[i];
            }
          }

           double average = total / 7;
           
        System.out.println("\n----- Expense Summary -----");
        System.out.println("Total Weekly Expense: " + total);
        System.out.println("Average Expense: " + average);
        System.out.println("Highest Expense: " + max);
        System.out.println("Lowest Expense: " + min);
        System.out.println("Highest Expense Day: " + days[maxDayIndex]);

    }
}















