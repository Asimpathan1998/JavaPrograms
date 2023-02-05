package part2.Collections;

import java.util.Collections;
//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;

public class ArrayListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animal = new LinkedList<String>();
		
	//	List<String> animal1 = new ArrayList<String>();
		
		// add elements
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Rabbit");
		//animal.remove(1);
		
		 Collections.sort(animal);
		 System.out.println(animal);
//		String s1 = new String("Asim");
//		String s2 = "Asim";
//		String s3 = "Asim";
		try {
		
		for(String obj : animal) {
			//animal.add("Lion");
			animal.remove();
			System.out.println("Animal Name: " + obj);
			
		}
		}catch(Exception ex){
			
			System.out.println("Site Unavailble " + ex);
			
		}
		
		//System.out.println("ArrayList: " + animal);
	}

}
