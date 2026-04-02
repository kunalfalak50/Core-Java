import java.util.Scanner;
class StudentMarks{
 
       String name;
       int rollNo;
       int[] marks = new int [5];
       int total;
       double average,percentage;
       char grade;
       boolean promoted;

    void acceptData()
    {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Name:");
           name = sc.nextLine();

          System.out.println("Enter the Roll Number:");
             rollNo = sc.nextInt();
         
           System.out.println("Enter Mark of 5 Subject:");
                 for(int i=0;i < 5;i++)
                  {
                      System.out.println("Subject" + (i+1) + ": ");
                       marks[i] = sc.nextInt();
                   }
     }
     void calculate(){

           total = 0;

        for(int i = 0; i < 5;i++)
        {
            total += marks[i];
        }
           average = total / 5.0;
            percentage = average;
           
       if(percentage >= 90)
         grade = 'A';
       else if(percentage >= 75)
         grade = 'B';
       else if(percentage >= 60)
         grade = 'C';
       else if(percentage >= 40)
          grade = 'D';
        else
             grade ='F';

        if(percentage >= 40)
           promoted = true;
        else 
           promoted = false;
     }
       
      void display()
      {
      System.out.println("\n---------Student Report------");
      System.out.println("Enter the Name :" + name);
      System.out.println("Enter Roll Number: " + rollNo);
      System.out.println("Total Marks: " + total);
      System.out.println("Average : " + average);
      System.out.println("Percentage: " + percentage);
      System.out.println("Grade: " + grade);

       if(promoted)
         System.out.println("Promoted");
        else
         System.out.println("Not promoted(Fail)");
      }
   
   }
       class SchoolManagement{
      
          public static void main(String args[]){
           StudentMarks s1 = new StudentMarks();
           s1.acceptData();
           s1.calculate();
           s1.display();             
    }
}
    
