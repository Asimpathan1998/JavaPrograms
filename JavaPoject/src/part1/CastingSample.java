package part1;

class Animal {
	void makeNoise() {
		System.out.println("generic noise");
	}
}

class Cat extends Animal {
	void makeNoise() {
		System.out.println("bark");
	}

	void playDead() {
		System.out.println("roll over");
	}
}

public class CastingSample {
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Cat(), new Animal() };
		for (Animal animal : a) {
			animal.makeNoise();
			if (animal instanceof Cat) {
				// try to do a Dog behavior?
			}
		}
	}
}
