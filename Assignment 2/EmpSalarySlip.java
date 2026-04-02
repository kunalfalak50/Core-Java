import java.util.Scanner;

class Employee{

  String name;
  int id;
  double basicSalary;

   double hra;
   double da;
   double pf;
   double netSalary;

   Employee(String name,int id,double basicSalary)
   {
      this.name = name;
      this.id = id;
      this.basicSalary = basicSalary;
    }
     void calculateSalary()
     {
       hra =  0.20 * basicSalary;
       da =  0.10 * basicSalary;
       pf =  0.08 * basicSalary;
     
       netSalary = basicSalary + hra + da - pf;
       }

      void displaySlip()
      {
         System.out.println("\n========Salary Slip=========");
         System.out.println("Employee Name : " + name);
         System.out.println("Employee ID : " + id);
         System.out.println("------------------------------------");
         System.out.printf("Basic Salary  : %.2f\n", basicSalary);
        System.out.printf("HRA (20%%)     : %.2f\n", hra);
        System.out.printf("DA (10%%)      : %.2f\n", da);
        System.out.printf("PF (8%%)       : %.2f\n", pf);
        System.out.println("--------------------------------");
        System.out.printf("Net Salary    : %.2f\n", netSalary);
       }
}

  class EmpSalarySlip{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
    
       System.out.println("Enter Employee Name: ");
       String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

         // Object creation
        Employee emp = new Employee(name, id, basicSalary);

        // Display salary slip
        emp.calculateSalary();
        emp.displaySlip();
       }
}










