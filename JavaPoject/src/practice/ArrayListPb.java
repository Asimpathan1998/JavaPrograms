package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPb {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Dell");
		al.add("Lenovo");
		al.add("Apple");
		al.add("Hp");
		al.add("Acer");
		
		System.out.println("ArrayList before sorting:");
		for(String str: al) {
			System.out.println(str);
		}
		
		Collections.sort(al);
		
		//Collections.reverse(al);
		
		System.out.println("ArrayList in descending order:");
		for(String str1: al) {
			System.out.println(str1);
		}
		
		List<String> ll = new LinkedList<String>();
		ll.add("Orange");
		ll.add("Mango");
		ll.add("Pineapple");
		ll.add("Kiwi");
		ll.add("Banana");
		
		System.out.println("LinkedList before sorting:");
		for(String str2: ll) {
			System.out.println(str2);
		}
		
		ll.remove("Mango");
		
		System.out.println("LinkedList after removing Mango" + ll);
		
		ll.add("Stawberry");
	
		Collections.sort(ll);
		for(String str3: ll) {
			System.out.println(str3);
		}
	}

}
