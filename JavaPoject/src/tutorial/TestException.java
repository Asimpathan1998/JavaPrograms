package tutorial;

public class TestException {
	int i = 0;
	String name;
	//Integer obj;
	
	/*
	 * boolean a; Boolean obj2;
	 * 
	 * char c; Character obj3;
	 */
	
	public static void main(String[] args) {
		
		/*
		 * try { doStuff(); } catch (ArithmeticException AE) {
		 * 
		 * System.out.println(" You can not divide nymber with Zero ");
		 * System.out.println(AE.getMessage()); AE.printStackTrace(); }
		 */
		doStuff();
	}

	static void doStuff() {
		doMoreStuff();
	}

	static void doMoreStuff()  {
		try {
			int x = 5 / 0; // Can't divide by zero!
			// ArithmeticException is thrown here
		} catch (ArithmeticException ex) {
			throw ex;

		}

	}

}
