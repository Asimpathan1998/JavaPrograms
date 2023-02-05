package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell", 16, 85000));
		laps.add(new Laptop("Lenovo", 12, 75000));
		laps.add(new Laptop("Apple", 8, 95000));
		laps.add(new Laptop("HP", 16, 88000));
		laps.add(new Laptop("Acer", 4, 35000));

		Collections.sort(laps);
		
		for(Laptop l : laps) {
			System.out.println(l);
		}
	}
}
