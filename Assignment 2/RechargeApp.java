import java.util.Scanner;

class RechargeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input mobile number
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();

        int choice;

        // Show plans menu
        System.out.println("\n===== AVAILABLE RECHARGE PLANS =====");
        System.out.println("1. Rs. 199 → 28 days validity");
        System.out.println("2. Rs. 399 → 56 days validity");
        System.out.println("3. Rs. 599 → 84 days validity");
        System.out.print("Select a plan (1-3): ");
        
        choice = sc.nextInt();

        int amount = 0;
        String validity = "";

        // Switch based on user choice
        switch (choice) {
            case 1:
                amount = 199;
                validity = "28 days";
                break;

            case 2:
                amount = 399;
                validity = "56 days";
                break;

            case 3:
                amount = 599;
                validity = "84 days";
                break;

            default:
                System.out.println("Invalid selection!");
                sc.close();
                return;
        }

        // Confirmation output
        System.out.println("\n===== RECHARGE CONFIRMATION =====");
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Selected Plan : Rs. " + amount);
        System.out.println("Validity      : " + validity);
        System.out.println("Status        : Recharge Successful ");
        System.out.println("==================================");

        sc.close();
    }
}