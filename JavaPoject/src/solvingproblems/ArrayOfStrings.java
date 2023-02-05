package solvingproblems;
public class ArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		//another type of creating a string
		String[] fruits = {"Mango", "Banana","Apple", "Kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		String text = null;
		
		System.out.println(text);
		
		String[] texts = new String[2]; 
		
		System.out.println(texts[0]);
		
		texts[0] = "one";		//here we storing string to an array texts
	}

}
