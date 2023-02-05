package part1.oops;

class Area {
	protected int length; // instance object
	protected int breadth; // instance object

	Area() {
		System.out.println("This is default constructor");
	}

	// constructor to initialise value
	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// method to calculate area
	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}
}

public class EncapsulationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area rectangle = new Area(11, 12);
		//Area obj = new Area();			//this obj is created for default constructor
		rectangle.getArea();
		new Area();
	}

}
