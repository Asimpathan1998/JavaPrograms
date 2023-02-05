package tutorial;

//this is the example of "throw" keyword
class Age {
	void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - you havd must atleast 18 years old."); // here we throw
																									// exception
		} else {
			System.out.println("Access granted - you are old enough.");
		}
	}
}

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age obj = new Age();
		obj.checkAge(12);
	}
}
