package practice;

import java.util.Arrays;

class Fruits {

	public void variousFruit() {
		String FruitName[] = { "Mango", "Grapes", "Kiwi", "Orange" };
		System.out.println(Arrays.toString(FruitName));
		System.out.println(FruitName.hashCode());
		
		FruitName [1] ="Banana";
		System.out.println(Arrays.toString(FruitName));		//Array index 1 changes to banana
	}
}

public class ArrayPractice {

	public static void main(String[] args) {
		

		Fruits fruit = new Fruits();
		 fruit.variousFruit();
	}

}
