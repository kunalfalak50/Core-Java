class SalaryCasting
{
   public static void main(String args[])
    {
        //original salary
       double salary = 12345.57946;

         //explicit casting
        int intSalary = (int)salary;

        float floatSalary = (float)salary;

        System.out.println("Original double salary: " + salary);
        System.out.println("After casting to int (explicit): " + intSalary);
        System.out.println("After casting to float: " + floatSalary);

        System.out.println("\n--- Precision Loss Explanation ---");
        System.out.println("Double value lost decimal part when converted to int.");
        System.out.println("Float value may lose precision after decimal compared to double.");
    }
}