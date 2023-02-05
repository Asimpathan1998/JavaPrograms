package part1.oops;

//Java program to illustrate
//Automatic Resource Management
//in Java with multiple resource

import java.io.*;

//custom resource 1
class Sdemo implements Closeable {
	void show() {
		System.out.println("inside show");
	}

	public void close() {
		System.out.println("close from Sdemo");
	}
}

//custom resource 2
class Sdemo1 implements Closeable {
	void show1() {
		System.out.println("inside show1");
	}

	public void close() {
		System.out.println("close from Sdemo1");
	}
}

class CloseableExample {
	public static void main(String s[]) {
		// note the order of opening the resources
		try (Sdemo d = new Sdemo(); Sdemo1 d1 = new Sdemo1()) {
			int x = 10 / 0;
			d.show();
			d1.show1();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
