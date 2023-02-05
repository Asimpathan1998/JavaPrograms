package java8;

@FunctionalInterface
interface Drawable {
	public void draw();
}

class Drawing implements Drawable {
	public void draw() {
		System.out.println("hello");
	}
}

public class LambdaExpressionPb {

	public static void main(String[] args) {

//		Drawing dr = new Drawing();
//		dr.draw();

		int width = 10;

		// with lambda expression
		Drawable d = () -> {
			System.out.println("Drawing " + width);
		};
		d.draw();
	}
}
