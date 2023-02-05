package part2.Collections;

import java.util.*;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");
		ll.add("Amit");

		Iterator<String> i = ll.descendingIterator();
		while (i.hasNext()) {
			System.out.println("Descending order: " + i.next());
		}

		System.out.println("Initial list of elements: " + ll);

		// Removing specific element from ArrayList
		ll.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + ll);

		// Removing element on the basis of specific position
		ll.remove(0);
		System.out.println("After invoking remove(index) method: " + ll);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Hanumat");

		// Adding new elements to ArrayList
		ll.addAll(ll2);
		System.out.println("Updated list : " + ll);

		// Removing all the new elements from ArrayList
		ll.removeAll(ll2);
		System.out.println("After invoking removeAll() method: " + ll);

		// Removing first element from the list
		ll.removeFirst();
		System.out.println("After invoking removeFirst() method: " + ll);

		// Removing first element from the list
		ll.removeLast();
		System.out.println("After invoking removeLast() method: " + ll);

		// Removing first occurrence of element from the list
		ll.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking removeFirstOccurrence() method: " + ll);

		// Removing last occurrence of element from the list
		ll.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: " + ll);

		// Removing all the elements available in the list
		/*
		 * ll.clear(); System.out.println("After invoking clear() method: " + ll);
		 */
		
		for(String s : ll) {
			System.out.println("Length of element: " + s.length());
		}
	}
}
