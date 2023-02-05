package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExp {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Sanket");
		list.add("Rahul");
		list.add("Mahesh");
		list.add("Samir");

		list.forEach((n) -> System.out.println(n));
	}

}
