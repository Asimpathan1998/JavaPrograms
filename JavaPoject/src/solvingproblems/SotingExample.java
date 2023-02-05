package solvingproblems;
import java.util.Arrays;

public class SotingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {55, 45, 5, 47, 89};
		System.out.println("The original array is: ");
		
		for(int num: arr) {
			System.out.println(num + "");
		}
		Arrays.sort(arr);
		
		System.out.println("\n The sorted array is: ");
		
		for(int num: arr) {
			System.out.println(num + "");
		}
	}

}
