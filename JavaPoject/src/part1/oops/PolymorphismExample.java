package part1.oops;

class Food{
	public Food() {											//constructor
		System.out.println("Yumm, This  food is so yummy.");
	}
	public void biryani() {
		System.out.println("This is my favorite food.");
	}
}

class Dish extends Food{
	@Override
	public void biryani() {							//here biryani method is overridden
		System.out.println("Afgani Biryani.");
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		Dish dish = new Dish();
		Food food = new Food();
		
		food.biryani();
		dish.biryani();
	}
}
