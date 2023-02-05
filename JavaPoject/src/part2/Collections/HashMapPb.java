package part2.Collections;

import java.util.HashMap;
import java.util.Map;

class Emp {
	int id;

	public Emp(int id) {
		this.id = id;
	}
}

public class HashMapPb {

	public static void main(String[] args) {
		Emp emp1 = new Emp(1);
		Emp emp2 = new Emp(2);

		Map<Emp, String> map = new HashMap<>();
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");

		System.out.println("Map is: " + map.size());

	}

}
