package part1.oops;

public class InstanceOfExample {
	public static void main(String[] args) {
		InstanceOfExample a = new InstanceOfExample();
		InstanceOfExample b = new InstanceOfExample();

		if (!a.equals(b))
			System.out.println("They are not equal");
		if (a instanceof Object)
			System.out.println("a is an Object");

	}
}
