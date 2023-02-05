package part2.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String args[]) {
		// create a hash set
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
		
		//Iteration
		for(String s : hs) {
			System.out.println( s);
		}
	}
}
