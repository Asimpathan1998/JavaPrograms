package part2.Collections;

import java.util.Hashtable;
import java.util.Map;

class TextBook {
	int id;
	String name;
	int quantity;

	public TextBook(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
}

public class HashTableExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(101, "English");
		map.put(102, "Maths");
		map.put(103, "Hindi");
		map.put(104, "Science");
		
		
		System.out.println("Intial map: " + map);
		
		map.putIfAbsent(105, "History");
		
		System.out.println("Upgrated map" + map);
		
		
		Map<Integer,TextBook> tb = new Hashtable<Integer,TextBook>();
		TextBook t1 = new TextBook(501, "Social science", 5);
		TextBook t2 = new TextBook(502, "Geoghraphy", 10);
		
		tb.put(1, t1);
		tb.put(2, t2);
		System.out.println("-----------------------------------------------");
		System.out.println("id " +  "\t name " + "\t\t Quantity " );
		System.out.println("-----------------------------------------------");
		System.out.println( t1.id  +  "\t" + t1.name + "\t  " + t1.quantity);
		System.out.println( t2.id  +  "\t" + t2.name + "\t  " + t2.quantity);
	}

}
