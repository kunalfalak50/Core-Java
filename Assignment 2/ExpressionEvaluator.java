import java.util.Scanner;
class ExpressionEvaluator
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
  
       System.out.println("Enter value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter value of b: ");
        int b = sc.nextInt();

         System.out.println("Enter value of c: ");
        int c = sc.nextInt();

       int result = (a + b)*c;

       boolean result1 = (a > b) && (b > c);
 
       int result2 = a % b;

        System.out.println("====Result===");
   
        System.out.println("(a + b) * c = " + result);
        System.out.println("Explanation: First (a + b) is calculated, then multiplied by c.");

        System.out.println("\na > b && b > c = " + result1);
        System.out.println("Explanation: Checks if a is greater than b AND b is greater than c.");

        System.out.println("\na % b = " + result2);
        System.out.println("Explanation: Gives the remainder when a is divided by b.");

        sc.close();
    }
}