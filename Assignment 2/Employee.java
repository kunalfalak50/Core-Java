class Employee
{
    //static variable(shared by all object)
   static int counter = 0;

   //Instance variables
   int id;
   String name;
   
   Employee(String name)
   {
      counter++;
       id = counter;
       this.name =  name;
     }
    
      void display()
      {
           System.out.println("Employee Id: " + id);
           System.out.println("Employee Name: " + name);
       }

 public static void main(String args[])
 { 
   Employee e1 = new Employee("Rajesh");
   Employee e2 = new Employee("Kamlesh");
   Employee e3 = new Employee("Sneha");
 
        e1.display();
        e2.display();
        e3.display();
    }
}