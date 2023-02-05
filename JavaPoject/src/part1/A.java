package part1;

public interface A {

	void myMethod();
	
	public static void main(String args[]) {
		A obj = new C();
		obj.myMethod();
	}
}
class B {
	public void myMethod() {
		System.out.println("My method");
	}
}
class C extends B implements A{
	
}
 
