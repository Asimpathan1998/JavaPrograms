package part1.oops;

class Human{
	Human(){
		System.out.println("This is Human constructor.");
		return;
	}
}
class Men extends Human{
	void women() {
		System.out.println("This is a women method");
	}
	 Men(int a, int b){						//Parameterised constructor
		 int c = a*b;
		 System.out.println("Product is: " + c); ;
	 }
}

public class InheritanceExample2 {

	public static void main(String[] args) {
		
		//new Human();
		Men obj2 = new Men(5,6);
		obj2.women();
		
	}

}
