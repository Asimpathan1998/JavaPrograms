package part1.oops;

class Cons{
	public Cons() {
		System.out.println("COns");
	}
}
public class ConstructorExample {
	
	public ConstructorExample() {
		System.out.println("Sum of the number is: ");
		
	}
	public ConstructorExample(int x, int y) {
		// TODO Auto-generated constructor stub
		int sum = x + y;
		 System.out.println(sum);
	}
	public static void main(String args[]) {
		new ConstructorExample();
		new ConstructorExample(5, 6);
		new Cons();
	}

}
