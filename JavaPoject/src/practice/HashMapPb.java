package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPb {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "TCS");
		map.put(2, "Infosys");
		map.put(3, "Accenture");
		map.put(4, "Microsoft");
		map.put(5, "Facebook");
		map.put(6, "amy");
		map.put(6, "may");
		
		System.out.println("HashMap is: " + map);
		 
		 
			
		if(map.containsValue("may")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (map.containsKey(1))
			System.out.println("Value is available: " + map.get(1));
		else
			System.out.println("Value unavailable");

	}

}
