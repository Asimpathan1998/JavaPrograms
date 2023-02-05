package part2.Collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(23);
		linkedList.add(24);
		linkedList.add(25);
		linkedList.add(28);
		linkedList.add(29);

		System.out.println("Linked list before poll() ");
		System.out.println(linkedList);
		linkedList.poll();
		System.out.println("Linked list after poll() ");
		System.out.println(linkedList);

//		System.out.println("Linked list before pollFirst() ");
//		System.out.println(linkedList);
		linkedList.pollFirst();
		System.out.println("Linked list after pollFirst() ");
		System.out.println(linkedList);

//		System.out.println("Linked list before pollLast() ");
//		System.out.println(linkedList);
		linkedList.pollLast();
		System.out.println("Linked list after pollLast() ");
		System.out.println(linkedList);

	}

}