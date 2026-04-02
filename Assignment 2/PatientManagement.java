class Patient
{
  int patientId;
  String patientName;
  int age;
  String disease;

  Patient(int id,String name,int age,String disease)
  {
     this.patientId = id;
     this.patientName = name;
     this.age = age;
     this.disease = disease;
  }
  
  void displayDetails()
  {
     System.out.println("Patient Id: " + patientId);
     System.out.println("Name: " + patientName);
     System.out.println("Age: " + age);
     System.out.println("Disease: " + disease);
  }
  
  void checkSeniorCitizen()
  {
    if(age >= 60)
     {
      System.out.println("Senior Citizen");
     }
     else{
      System.out.println("Not a Senior Citizen");
     }
   }
}
class PatientManagement
{
  public static void main(String args[])
  {
    Patient p1 =  new Patient(101,"Rahul",64,"Diabetes");
    Patient p2 =  new Patient(102,"Riya",24,"Fever");
    Patient p3 =  new Patient(101,"Raj",40,"Heart Disease");

     System.out.println("---- Patient 1 ----");
     p1.displayDetails();
     p1.checkSeniorCitizen();
  
     System.out.println("---- Patient 2 ----");
     p2.displayDetails();
     p2.checkSeniorCitizen();

     System.out.println("---- Patient 3 ----");
     p3.displayDetails();
     p3.checkSeniorCitizen();

    }
}
































