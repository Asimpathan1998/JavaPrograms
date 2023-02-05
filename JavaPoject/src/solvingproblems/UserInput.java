package solvingproblems;
import java.util.Scanner;

// Taking User input
public class UserInput {

	public static void main(String[] args) {
		// Create scanner object
		
		try (Scanner input = new Scanner(System.in)) {
			//Output the prompt
			System.out.println("Enter a line of text: ");
			
			//wait  for the user to enter a line  of text
			String line = input.nextLine();
			
			//tell them what  they entered
			System.out.println( "You Entered: " + line );
		}
	}

}
