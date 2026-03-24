import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        // Reverse logic
        while (num != 0) {
            int digit = num % 10;        // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;             // remove last digit
        }

        
        System.out.println("Reversed number = " + reverse);

        
    }
}