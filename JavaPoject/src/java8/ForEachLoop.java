package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Cricket");
		list.add("Golf");
		list.add("Tennis");
		list.add("Football");

		System.out.println("Iterating by passing Lambda Expression:");

		list.forEach(games -> System.out.println(games));
		System.out.println("\nIterating by passing method reference:");

		list.forEach(System.out::println);
	}
}
