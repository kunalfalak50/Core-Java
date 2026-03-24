import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();
     
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

       
        String reversed = new StringBuilder(cleaned).reverse().toString();

         if (cleaned.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

      
    }
}