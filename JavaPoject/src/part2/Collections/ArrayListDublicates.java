package part2.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDublicates {

	public static <T> ArrayList<T> removeDublicates(ArrayList<T> alist) {

		// create new ArrayList
		ArrayList<T> newList = new ArrayList<>();

		for (T element : alist) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}

		return newList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 7, 8, 5, 2, 1, 7, 7, 9, 6, 8));

		System.out.println("ArrayList with dublicates: " + list);

		ArrayList<Integer> newList = removeDublicates(list);

		System.out.println("ArrayList after removing dublicates: " + newList);

		/*
		 * List<Integer> arr = new ArrayList<Integer>(); arr.add(5); arr.add(2);
		 * arr.add(5); arr.add(1); arr.add(2); arr.add(7); arr.add(3);
		 * 
		 * System.out.println("Print list: " + arr);
		 * 
		 * List<Integer> nList = arr.stream().distinct().collect(Collectors.toList());
		 * 
		 * System.out.println("List after remove dublicates: " + nList);
		 */

		List<String> arr = new ArrayList<String>();
		arr.add("Asim");
		arr.add("Amir");
		arr.add("Asim");
		arr.add("Shubham");
		arr.add("Amir");
		
		System.out.println("Print String: " + arr);

		Set<String> dublicate = new HashSet<String>(arr);

		System.out.println(dublicate);
		
		/*
		 * Integer i1 = 1000; Integer i2 = 1000;
		 * 
		 * if(i1.equals(i2)) { System.out.println("Both are same"); }else
		 * System.out.println("Both are different");
		 */
	}
}
