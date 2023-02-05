package tutorial;
//With method overloading, multiple methods can have the same name with different parameters
public class MethodOverloadingProblem {

	static int plusMethod(int x, int y) {
		return x + y;
	}
	static double plusMethod(double x , double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum1 = plusMethod(10,20);
		double myNum2 = plusMethod(5.42, 7.62);
		System.out.println("int: "+ myNum1);
		System.out.println("int: " + myNum2);
	}

}
