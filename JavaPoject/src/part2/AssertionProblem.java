package part2;

import java.util.Scanner;

public class AssertionProblem {
	

	public static void main(String[] args) {
		 
		AssertionProblem d = new AssertionProblem();
		d.isAgeValid();
	}
	
	Scanner age = new Scanner(System.in);
	int t = age.nextInt();
	
	public boolean isAgeValid() {
//		assert(t<150):"Age entered is: " + age;
		if(t>=18 && t<=120) {
			System.out.println("Verified");
			return true;
			
		}
		else {
			System.out.println("Declined");
			return false;
		}
	}
}
