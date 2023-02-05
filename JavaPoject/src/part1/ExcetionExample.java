package part1;

public class ExcetionExample {

	public static void main(String[] args) {

		doStuff();

	}

	static void doStuff() {
		doMoreStuff();
	}

	static void doMoreStuff() {
		try {
			int x = 5 / 0;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
}
