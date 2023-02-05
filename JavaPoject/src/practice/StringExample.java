package practice;

class Motor{
	String car = "TOYOTA";
	public void carDesign(String car) {
		System.out.println("This is a " + car.concat(" Motor"));
		
//		System.out.println("This is a " + car.equalsIgnoreCase("Y"));
		
		System.out.println("This is a " + car.length());
		
		System.out.println("This is a " + car.toUpperCase());
		
		System.out.println("This is a " + car.trim());
		
	}
}

public class StringExample {
	public static void main(String args[]) {
		Motor obj = new Motor();
		obj.carDesign("toyota");
		
		  StringBuilder sb = new StringBuilder("This is a fantastic car"); 
		  //sb.append("a");
		  sb.reverse();					//this reverse the string
		  System.out.println(sb);
		
	}
}
