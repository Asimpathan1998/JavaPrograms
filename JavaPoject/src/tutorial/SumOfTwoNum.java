package tutorial;
import java.util.*;
 
public class SumOfTwoNum {
	public static int sum(int a, int b) {
		int sum = a + b;
	return sum;	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number:");
			a = sc.nextInt();
			System.out.println("Enter Second number:");
			b = sc.nextInt();
		}
		
		sum = sum(a,b);
		
		System.out.println("the sum of two number is:" + sum);
		
	}

	 

}
