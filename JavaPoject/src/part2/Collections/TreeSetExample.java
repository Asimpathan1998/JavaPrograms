package part2.Collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		 TreeSet<String> ts = new TreeSet<String>();
		 ts.add("Zahir");
		 ts.add("Sachin");
		 ts.add("Yuvraj");
		 ts.add("Umran");
		 ts.add("Virat");
		 ts.add("Bumrah");
		 ts.add("Shami");
		 ts.add("Virat");			//Duplicates are not allowed in TreeSet
		 
		 System.out.println(ts);	
		 
		 System.out.println(ts.add("Siraj"));
		 
		 System.out.println(ts.size());
		 for(String s : ts) {
			 System.out.println(s);			//TreeSet Print in Ascending Order
		 }
	}
}
