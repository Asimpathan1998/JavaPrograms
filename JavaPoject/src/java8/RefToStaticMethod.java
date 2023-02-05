package java8;
						//Reference to static method
@FunctionalInterface
interface Sayable{
	void say();
}

public class RefToStaticMethod {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
	
	public static void main(String[] args) {
		//reference static method
		Sayable sayable = RefToStaticMethod :: saySomething;
		
		//calling interface method
		sayable.say();
		
	}
}
