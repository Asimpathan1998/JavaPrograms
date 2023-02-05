package part2.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetPb {
	
	public  static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("Asim");
		set.add("Abhishek");
		set.add("Akash");
		set.add("Asim");
		
		for(String s: set) {
			System.out.println(s);
		}
	}
}
