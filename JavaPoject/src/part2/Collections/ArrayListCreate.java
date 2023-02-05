package part2.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> firstFivePrimeNumbers = new ArrayList<Integer>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		//Collections.sort(firstFivePrimeNumbers);
		 System.out.println("First Five Prime Number:" + firstFivePrimeNumbers);
		 
		//Create an ArrayList from another collection
		List<Integer> firstTenPrimeNumber = new ArrayList<Integer>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumber = new ArrayList<Integer>();
		nextFivePrimeNumber.add(13);
		nextFivePrimeNumber.add(17);
		nextFivePrimeNumber.add(19);
		nextFivePrimeNumber.add(23);
		nextFivePrimeNumber.add(29);
		
		//Adding entire collection to ArrayList
		firstTenPrimeNumber.addAll(nextFivePrimeNumber);
		
		System.out.println("First 10 Prime Number:" + firstTenPrimeNumber);
		
		//Employee
		 List<String> firstFourEmployeeName = new ArrayList<String>();
		 firstFourEmployeeName.add("Samir");
		 firstFourEmployeeName.add("Ravindra");
		 firstFourEmployeeName.add("Sachin");
		 firstFourEmployeeName.add("Rahul");
		 
		 System.out.println("First Four Employee Name: "+ firstFourEmployeeName);
		 
		 List<String> nextFourEmployeeName = new ArrayList<String>();
		 nextFourEmployeeName.add("John");
		 nextFourEmployeeName.add("Andrew");
		 nextFourEmployeeName.add("Alex");
		 nextFourEmployeeName.add("Peter");
		 
		 List<String> AllEmployeeName = new ArrayList<String>(firstFourEmployeeName);
		 AllEmployeeName.addAll(nextFourEmployeeName);
		 System.out.println("All Employees Name in Company:" + AllEmployeeName);
		 
		  nextFourEmployeeName.set(2, "Asim");			//set value
		 System.out.println(nextFourEmployeeName);
		

	}

}
