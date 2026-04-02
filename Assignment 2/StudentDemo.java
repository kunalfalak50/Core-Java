class Student
{
   String name;
   int rollNo;
 
   static int totalStudents = 0;
 
   Student(String name, int rollNo)
   {
      this.name = name;
      this.rollNo = rollNo;
 
      totalStudents++;
   }
    
   void display()
   {
      System.out.println("Name: "+ name + ",Roll No: " + rollNo);
    }

    static void displayTotalStudents()
    {
      System.out.println("Total Students: "+ totalStudents);
     }
  } 

class StudentDemo
{
   public static void main (String args[])
   {
     Student s1 = new Student("Kunal",1);
     Student s2 = new Student("Rahul",2);
     Student s3 = new Student("Sneha",3);

     s1.display();
     s2.display();
     s3.display();

     Student.displayTotalStudents();
   }
}
