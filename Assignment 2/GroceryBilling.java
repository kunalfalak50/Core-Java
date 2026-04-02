import java.util.Scanner;

class GroceryStore{

     String[] itemNames;
     int[] quantities;
     double[] prices;
     double[] itemTotal;
     int n;
     double totalBill = 0;
     double discount = 0;
     double finalBill =0;

//Constructor
   GroceryStore(int n){

       this.n = n;

       itemNames = new String[n];
       quantities = new int[n];
       prices = new double[n];
       itemTotal = new double[n];
    }
  
     void acceptData()
     {
        Scanner sc = new Scanner(System.in);
  
          for(int i = 0; i < n;i++)
          {
               System.out.println("\nEnter details for items" + (i + 1));
                
               System.out.println("Item Name:");
                itemNames[i] = sc.next();
   
               System.out.println("Quantity:");
                quantities[i] = sc.nextInt();

              System.out.println("Price:");
                prices[i] = sc.nextDouble();

              //Calculate item total
              itemTotal[i] = quantities[i] * prices[i];
            }
         }
      
//calculate total bill

         void calculateBill()
         {
            for(int i = 0; i<n;i++){
                totalBill += itemTotal[i];
             }
        
             if(totalBill > 3000)
             {
                 discount = totalBill * 0.10;
              }
              
               finalBill = totalBill - discount;
            }

           void displayBill(){
             
               System.out.println("\n============ Grocery Bill=============");
               System.out.printf("%-10s %-10s %-10s %-10s\n","Item", "Quantity", "Price", "Total");
 
                for(int i = 0 ;i<n;i++){
                System.out.printf("%-10s %-10d %-10.2f %-10.2f\n",itemNames[i],quantities[i],prices[i],itemTotal[i]);
               }
                System.out.println("--------------------------------------");
                System.out.println("Total Bill : Rs. " + totalBill);
                System.out.println("Discount :Rs. " + discount);
                System.out.println("Final Bill :Rs. " + finalBill);
                System.out.println("============================================");
              }
    }
 class GroceryBilling{
  
        public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of item: ");
         int n = sc.nextInt();

        GroceryStore g1 = new GroceryStore(n);
        g1.acceptData();
        g1.calculateBill();
        g1.displayBill();

    }
}



























   

             
   