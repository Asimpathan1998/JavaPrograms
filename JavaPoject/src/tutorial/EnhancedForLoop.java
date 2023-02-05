package tutorial;

import java.util.ArrayList;
import java.util.Collection;

public class EnhancedForLoop {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String [] names = {"Asim", "Mahesh", "Karan", "Shubham", "Parag"}; for(String
		 * name : names) { System.out.println(name); }
		 */
		Collection<Integer> ages = new ArrayList<Integer>(); 
		ages.add(19);
		ages.add(20);
		ages.add(25);
		
		int agesSum = 0;
		for(Integer age : ages) {
			agesSum += age;
		}
		System.out.println("Sum of age is: " + agesSum);
	}
}
