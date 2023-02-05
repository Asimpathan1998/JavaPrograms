package part2.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetProblem {
														
	public static void main(String[] args) {
		//Creating
		HashSet<Integer> set = new HashSet<>();
		//Insert
		set.add(5);		//list.add(element)
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);		//in HashSet duplicates are not allows
		set.add(5);
		//Size
		System.out.println("size of set is: " + set.size());
		
		
		System.out.println(set);		//print all elements
		
		//Search - contains
		if(set.contains(3)) {
			System.out.println("set contains number" );
		}
		if(!set.contains(7)) {
			System.out.println("Does not contain");
		}
		
		//Delete
		set.remove(1);
	  	if(!set.contains(1)) {
			System.out.println("does not contain 1 - we deleted 1");
		}
		
		//Iterator
		Iterator<Integer> it = set.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
