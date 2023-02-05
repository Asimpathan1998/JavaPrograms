package part2.Collections;
import java.util.*;

public class LinkedHashSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("John");
		lhs.add("Rock");
		lhs.add("Tylor");
		lhs.add("Justin");
		lhs.add("Martin");
		
		System.out.println("The Linked Hash Set is: " + lhs);
		
		//removing an element from set
		System.out.println(lhs.remove("Rock"));
		
		System.out.println("Set after removing an element is: " + lhs);
		
		System.out.println(lhs.remove("Asim"));
		System.out.println(lhs);
	}	

}
