class StudentMarks
{
  public static void main(String args[])
  {
    
      int[][] marks= {
          {85, 90, 78},
          {88, 76, 92},
          {70, 80, 75}
       };
     
       int students = marks.length;
       int subjects = marks[0].length;

       System.out.println("Student\tSub1\tSub2\tSub3\tTotal\tAverage");
        System.out.println("-------------------------------------------------------");

        // Loop through students
        for (int i = 0; i < students; i++) {
            int total = 0;

            System.out.print("S" + (i + 1) + "\t");

            // Loop through subjects
            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }

            double average = (double) total / subjects;

            System.out.print(total + "\t" + average);
            System.out.println();
        }
    }
}