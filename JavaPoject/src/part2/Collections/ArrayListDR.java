package part2.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListDR {
	
	public static <T> ArrayList <T> removeDublicates(ArrayList<T> list){
		
		//Create new LinkedHashSet
		Set<T> set = new LinkedHashSet<>();
		
		set.addAll(list);
		
		list.clear();
		
		list.addAll(set);
		
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		
		System.out.println("Print the array list: " + list);
		
		//Remove dublicates
		ArrayList<Integer> newList = removeDublicates(list);
		
		System.out.println("ArrayList after removing dublicates: " + newList);

	}

}
