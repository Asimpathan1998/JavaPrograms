package practice;

class Animal{
	public String Lion;
	public String Elephant;
	public String Zebra;
	
	public void eat(String Zebra, String Elephant, String Lion) {
		this.Lion = Lion;
		this.Elephant = Elephant;
		this.Zebra = Zebra;
		
		System.out.println("Lion eat " + this.Lion);
		System.out.println("Elephant eat " + this.Elephant);
		System.out.println("Zebra eat " + this.Zebra);
	}
}

public class PracticeProblem {

	public static void main(String[] args) {
		 Animal obj = new Animal();
		 obj.eat("Grass","Grass","Meat");
	}

}
