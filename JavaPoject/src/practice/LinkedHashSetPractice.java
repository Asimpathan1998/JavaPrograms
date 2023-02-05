package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Karan");
		set.add("Manish");
		set.add("Sanjiv");
		set.add("Abuzar");
		set.add("Karan");

		System.out.println(set);
		System.out.println(set.add("Lalit"));
		System.out.println(set);
		System.out.println(set.remove("Abuzar"));
		System.out.println(set);

		System.out.println(set.contains("Kara"));
		System.out.println(set.size());
		/*
		 * for(String a: set) { System.out.println(set.toString()); }
		 */

	}

}
