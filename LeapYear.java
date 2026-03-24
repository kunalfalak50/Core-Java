import java.util.Scanner;
class LeapYear{
  
   public static void main(String args[]){
  
   int i;
   Scanner in = new Scanner(System.in);

    System.out.println("Enter the number");
    
      i = in.nextInt();

    if(i % 4 == 0)
     { 
       System.out.println("It is a leap year");
     }
     else {
        System.out.println("it is not leap year");
      }
  }
}
