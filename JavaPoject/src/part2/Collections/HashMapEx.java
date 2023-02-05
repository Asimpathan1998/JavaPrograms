package part2.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Asim", "774124582");
		phonebook.put("Shabir", "974124582");
		phonebook.put("Akash", "9241245957");
		phonebook.put("Mandip", "974124583");
		phonebook.put("Atharva", "724124584");

		Set<String> keys = phonebook.keySet();

		for (String i : keys) {
			System.out.println(i + " : " + phonebook.get(i));
		}
		
		System.out.println("---------------OR----------------");
		
		for(Entry<String, String> m: phonebook.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}
}
