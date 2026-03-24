import java.util.Scanner;

class PrintInput5
{
	public static void main(String args[])
	{
		char ch;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character: ");
             
                 ch = sc.next().charAt(0);
		
                 

	char next = (char) (ch + 1);
        char prev = (char) (ch - 1);

        System.out.println("Entered character: " + ch);
        System.out.println("Next character: " + next);
        System.out.println("Previous character: " + prev);
	}
}

