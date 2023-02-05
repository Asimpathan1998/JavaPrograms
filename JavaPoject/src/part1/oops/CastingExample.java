package part1.oops;
	
	class Bike{
		void brandedBike() {
			System.out.println("Hero");
		}
	}
	class Yamaha extends Bike{
		void brandedBike() {
			System.out.println("R15");
		}
		void colorOfBike() {
			System.out.println("Red");
		}
	}
public class CastingExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b[] = {new Bike(), new Yamaha(), new Bike()};
		
		for(Bike bike : b) {
			bike.brandedBike();
			if(bike instanceof Yamaha){
					((Yamaha) bike).colorOfBike();
				
			}
		}
	}

}
