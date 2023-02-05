//This example is on converting HashSet into Array
package practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetPb {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Soccer");
		hs.add("Cricket");
		hs.add("Baseball");
		hs.add("Voleyball");

		System.out.println("HashSet object contain: " + hs);

		// Initialising an array of HashSet size
		String[] array = new String[hs.size()];
		int index = 0;

		// Iterating over the HashSet and adding elements to the Array
		for(String element: hs) {
			array[index++] = element;
		}
		
		System.out.println("Array object contains: ");
		for(String str : array) {
			System.out.println(str);
		}
	}

}
