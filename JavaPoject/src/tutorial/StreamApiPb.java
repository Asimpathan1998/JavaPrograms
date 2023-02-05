package tutorial;

import java.util.Arrays;
import java.util.List;

public class StreamApiPb {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(4, 5, 6, 1, 9);
		
//		Stream<Integer> data = num.stream();
//		
//		System.out.println("New Stream: ");
//		Stream<Integer> mappedData = data.map(n -> n*2);
//		
//		mappedData.forEach(n -> System.out.println(n));

		num.stream()
					.map(n -> n*2)
					.forEach(n -> System.out.println(n));
	}

	
}
