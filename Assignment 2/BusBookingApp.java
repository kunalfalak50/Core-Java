import java.util.Scanner;

class Bus {
    boolean[] seats = new boolean[10]; // 

    // View seats
    void viewSeats() {
        System.out.println("\nSeat Status:");

        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.println("Seat " + (i + 1) + " : Booked");
            } else {
                System.out.println("Seat " + (i + 1) + " : Available");
            }
        }
    }

    // Book seat
    void bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (seats[seatNumber - 1]) {
            System.out.println("Seat already booked! ");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " booked successfully ");
        }
    }

    // Cancel seat
    void cancelSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (!seats[seatNumber - 1]) {
            System.out.println("Seat is already available!");
        } else {
            seats[seatNumber - 1] = false;
            System.out.println("Seat " + seatNumber + " booking cancelled ");
        }
    }
}

public class BusBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus bus = new Bus();

        int choice;

        do {
            System.out.println("\n===== BUS BOOKING SYSTEM =====");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bus.viewSeats();
                    break;

                case 2:
                    System.out.print("Enter seat number to book (1-10): ");
                    int bookSeat = sc.nextInt();
                    bus.bookSeat(bookSeat);
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel (1-10): ");
                    int cancelSeat = sc.nextInt();
                    bus.cancelSeat(cancelSeat);
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        
    }
}