import java.util.Scanner;

class Book {
    int bookId;
    String bookName;

    // Constructor
    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    // Display method
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("----------------------");
    }
}

class Library {

    // Method to display books
    void displayBooks(Book[] books) {
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}

public class LibrarySystem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            books[i] = new Book(id, name);
        }

        // Pass to Library
        Library lib = new Library();
        lib.displayBooks(books);

        sc.close();
    }
}


















         

















