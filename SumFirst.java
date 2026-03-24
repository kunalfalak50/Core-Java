import java.util.Scanner;

public class SumFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int sum = 0;

        // Calculate sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        
        System.out.println("Sum = " + sum);

        
    }
}