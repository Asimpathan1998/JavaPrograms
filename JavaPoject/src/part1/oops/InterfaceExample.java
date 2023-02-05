package part1.oops;

interface FirstInterface {		 // interface method
	public void myMethod();		 // provide legal implementations
								// for every method defined in the interface
}

interface SecondInterface { // interface method
	public void myOtherMethod();
}

class Demo implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text.."); // here we write written method of interface method
	}

	public void myOtherMethod() {
		System.out.println("Some other text");
	}

}

public class InterfaceExample {
	public static void main(String args[]) {
		Demo myObj = new Demo();
		myObj.myMethod();
		myObj.myOtherMethod();

	}
}
