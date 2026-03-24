import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for easy checking
        ch = Character.toLowerCase(ch);

        // Check vowel or consonant
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a Vowel");
            } else {
                System.out.println("It is a Consonant");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        
    }
}