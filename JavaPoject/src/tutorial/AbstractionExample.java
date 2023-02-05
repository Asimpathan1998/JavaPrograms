package tutorial;

abstract class Vehicle {

//	byte a = 127;					//instance variable
//	float  b = 100.23f;
//	int c = (int) b;
//	int d = 20;

	public abstract void bikeCompany(); // abstract method (does not have body)
	// Regular method

	public void hero() {
		System.out.println("This are the bikes from Hero.");
	}
}

//subclass (inherited from AbstractionExample)
class Bajaj extends Vehicle {

	public void bikeCompany() {
		// The body of bikeCompany is provided here
		System.out.println("This are the bikes from Bajaj.");
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		Bajaj myBajaj = new Bajaj();
		myBajaj.bikeCompany();
		
	}
}
