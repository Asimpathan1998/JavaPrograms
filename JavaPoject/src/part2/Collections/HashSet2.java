package part2.Collections;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Asim");
		set.add("Mahesh");
		set.add("Mayur");
		set.add("Shubham");
		set.add("Abhishek");

		System.out.println("An initial list of an Elements: " + set);

		// Removing specific element from set
		set.remove("Mahesh");
		System.out.println("HashSet after removing element: " + set);

		// Adding new element
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Diraj");
		set1.add("Akash");

		set.addAll(set1);
		System.out.println("Updated list after adding new element: " + set);

		// Removing all the elements from the list
		set.removeAll(set1); // removeAll will remove all new element from the list
		System.out.println("After removing new element: " + set);

		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Abhishek"));
		System.out.println("After removing specific element: " + set);

		set.clear();
		System.out.println("After invoking clear() method: " + set);

		for (String s : set1) {
			System.out.println(s);
		}
	}

}
