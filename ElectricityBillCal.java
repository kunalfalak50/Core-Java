import java.util.Scanner;

class ElectricityBill{

   String name;
   int consumerNo;
   int unit;
    double billamount;
    double surcharge;
    double totalBill;

    ElectricityBill(String name,int consumerNo,int unit){
    
      this.name = name;
      this.consumerNo = consumerNo;
      this.unit = unit;
        calculateBill();
        calculateSurcharge();
        totalBill = billamount + surcharge;
      }
     void calculateBill(){
    
           if(unit<=100){
                 billamount = unit * 5;
            }
            else if(unit<=200){
                 billamount = (100 * 5) + ((unit -  100)*7);
            }
             else{
                   billamount = (100*5) + ((unit - 200) * 10);
              }
          }
           
         void calculateSurcharge(){
           if(billamount > 1500){
               surcharge = billamount * 0.05;
            }
             else{
               surcharge = 0;      
            }
         }

          void display(){
        System.out.println("\n------Electricity Bill-------");
        System.out.println("Customer Name :" + name);
        System.out.println("Consumer Number :" + consumerNo);
        System.out.println("Unit Consumed :" + unit);
        System.out.println("BillAmount :RS. " + billamount);
        System.out.println("Surecharge :RS. " + surcharge);
        System.out.println("Total Bill :RS. " + totalBill);
        }
}
class ElectricityBillCal{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Customer Name: ");
       String name =sc.nextLine();
    
     
     System.out.println("Enter Consumer Number: ");
       int consumerNo =sc.nextInt();
    
     System.out.println("Enter Units Consumed: ");
       int unit =sc.nextInt();
     
      ElectricityBill s1 = new ElectricityBill(name, consumerNo, unit);
          s1.display();
         s1.calculateBill();
         s1.calculateSurcharge();
            
    }
}
