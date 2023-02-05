package part2.GenericsAndCollections;

import java.util.HashMap;

class Car {
	int model;
	int vin;
	String CarOwnerName;
	
	//equals and hashcode method needs to be implemented
	

}

public class HasHash {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();

		HasHash h = new HasHash(5);

		HashMap<Object, Object> map = new HashMap<>();
		map.put("Asim", "123");
		
		map.put(car1, "BMW");
		map.put(car2, "Honda");
		System.out.println("!!!!!! " + map.get(car1));
		System.out.println("!!!!!! " + map.get("Asim"));
		h.hashCode();
	}

	public int x;

	HasHash(int xVal) {
		x = xVal;
	}

	public boolean equals(Object o) {
		HasHash h = (HasHash) o; // Don't try at home without
									// instanceof test
		if (h.x == this.x) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return (x * 17);
	}
}
