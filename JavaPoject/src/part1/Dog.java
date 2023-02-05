package part1;

class Collar{
	
}

public class Dog {

	Collar c;			//instance variable
	String name;		//instance variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.go(d);
		
		System.out.println("Aiko");
	}
	void go(Dog dog) {
		c = new Collar();
		dog.setName("Aiko");
		
	}
	void setName(String dogName) {
		name = dogName;
	}

}
