import java.util.Scanner;

class WeeklyWorkHours {
  
   public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter number of employees:");

    int employees = sc.nextInt();

    // Declare jagged array
        int[][] workHours = new int[employees][];

        // Input work hours
        for (int i = 0; i < employees; i++) {
            System.out.print("\nEnter number of days employee " + (i + 1) + " worked: ");
            int days = sc.nextInt();

            workHours[i] = new int[days];

            System.out.println("Enter hours for " + days + " days:");
            for (int j = 0; j < days; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                workHours[i][j] = sc.nextInt();
            }
        }

        // Display work hours
        System.out.println("\n--- Employee Work Hours ---");
        for (int i = 0; i < workHours.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < workHours[i].length; j++) {
                System.out.print(workHours[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}