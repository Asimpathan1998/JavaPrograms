package java8;

interface School {
	// default method
	default void campus() {
		System.out.println("This is a default method.");
	}

	// abstract method
	public void playGround(String s);
}

public class DefaultMethodEx implements School{

	@Override
	public void playGround(String s) {
		 System.out.println(s);
	}

	public static void main(String[] args) {
		DefaultMethodEx dm = new DefaultMethodEx();
		dm.playGround("This is abstract method.");		//calling abstract method
		dm.campus();									//default method
	}
}
