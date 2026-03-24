import java.util.Scanner;
  
   class SumOdd{
      
       public static void main(String args []){

         Scanner in = new Scanner(System.in);

         System.out.print("Enter a number :");
         int n = in.nextInt();
          int sum=0;
       for(int i=1; i<=n; i++){
    
          if(i %2 !=0){
           
         sum = sum + i;
            }
            
          }
          System.out.println("Sum of Odd "+ n + " is : "+sum);
     }
}
