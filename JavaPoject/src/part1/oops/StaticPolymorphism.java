package part1.oops;

class StaticPoly{
	void sum(int x, int y) {
		int s = x + y;
		System.out.println("Sum of two number: " + s);
	}
	
	
}
class OverLoading extends StaticPoly{
	void sum(double d, double e, double f) {
		double sm = d + e + f;
		System.out.println("Sum of three number: " + sm);
	}
}

class Team extends StaticPoly{
	@Override
	void sum(int x, int y) {
		int s = x + y;
		System.out.println("Sum: " + s);
	}
}

public class StaticPolymorphism {

	public static void main(String[] args) {
		StaticPoly obj = new StaticPoly();
		obj.sum(10, 20);
		
		OverLoading obj1 = new OverLoading();
		obj1.sum(10.9, 20.1, 45.5);
		
		
	}

}
