package solvingproblems;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		 
		
		System.out.println("Please enter a command:");
		String text = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Machine started.");
			break;
		case "stop":
			System.out.println("machine stop.");
			break;
		default:
			System.out.println("Command not recognized.");
			break;
		}
	}

}
