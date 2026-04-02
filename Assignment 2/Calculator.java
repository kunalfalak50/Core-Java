class Calculator
{
      int calculate(int a, int b){
               return a + b;
      }
   
       double calculate(double a,double b){
              return a + b;
         }
        
        int calculate(int a,int b,int c){
            return a + b + c;
          }
    public static void main(String args[]){
 
        Calculator c1 = new Calculator();

         int result1 = c1.calculate(10, 20);
         double result2 = c1.calculate(5.5, 4.5);
         int  result3 = c1.calculate(5,8,6);
 
        System.out.println("Result of int + int: " + result1);
        System.out.println("Result of double + double: " + result2);
        System.out.println("Result of int + int + int: " + result3);
    }
}