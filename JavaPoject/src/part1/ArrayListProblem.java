package part1;
import java.util.*;
public class ArrayListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c = new ArrayList<String>();    
		c.add("Ferrari");
		c.add("Mercedes");
		c.add("BMW");
		c.add("Honda");
		c.add("Aston Martin");
		
		System.out.println("The Sports Car brands are " + c);
		
		int index = c.indexOf("BMW");
		System.out.println(c + " " + index);
		c.add(2,"Audi");
		c.remove(3);
		System.out.println("One new car added by to arraylist  " + c);
	}

}
