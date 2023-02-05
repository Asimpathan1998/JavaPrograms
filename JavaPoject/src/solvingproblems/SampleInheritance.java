package solvingproblems;

class Test {
	public void animalSound() {
		System.out.println("The animal making a sound");
	}

	public void bark() {
		System.out.println("testing");
	}

	public void animalSound(String str) { // this is method overloading
		System.out.println("Overloading method: " + str);
	}
}

class Cat extends Test { // this is overrinde class of tests
	public void animalSound() {
		System.out.println("The cat makes meow meow");
	}

	public void bark() { // this is overrinde class of tests
		System.out.println("Hello animals");
	}
}

class Dog extends Test { // this is overrinde class of tests
	public void animalSound() {
		System.out.println("The dog makes bow bow");
	}
}

public class SampleInheritance {
	public static void main(String[] args) {
		Test myAnimal = new Test();
		Cat cat = new Cat();
		Dog dog = new Dog();

		myAnimal.animalSound();
		cat.animalSound();
		dog.animalSound();
		// myAnimal.bark();
		cat.bark();
		myAnimal.animalSound("Lion");
	}
}
