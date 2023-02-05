package part2.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String args[]) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer, String>();
		map.put(1,"Amit");
		map.put(2,"Vijay");
		map.put(4,"Sachin");
		map.put(3, "Praful");
//System.out.println(map);
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + "-> " + m.getValue());
		}
		
		if(map.remove(1,"Amit")) {
			System.out.println(map);
		}
	}
}
