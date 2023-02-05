package part1.oops;

class Species {
	static void doStuff() {
		System.out.println("animal ");
	}
}

class Dog extends Species {
	
	static void doStuff() { // it's a redefinition,
		// not an override
		System.out.println("dogs ");
	}
}

public class StaticAnimal {

	public static void main(String[] args) {
	
		
		/*
		 * Species obj = new Species(); obj.doStuff();
		 */													//we don't need to create object for a static class
		 
		// TODO Auto-generated method stub
		Species a[] = { new Species(), new Dog(), new Species() };
		for (int x = 0; x < a.length; x++) {
			Species.doStuff();
		}
		Dog.doStuff();
	}
	
}
