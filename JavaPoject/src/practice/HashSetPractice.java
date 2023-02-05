package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Justin");
		set.add("Marks");
		set.add("Selena");
		set.add("Tom");
		set.add("Marks");

		System.out.println(set);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // unsorted & unordered
		}
	}

}
