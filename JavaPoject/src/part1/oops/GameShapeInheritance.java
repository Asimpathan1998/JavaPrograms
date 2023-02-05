package part1.oops;

class Shape{
	public void displayShape() {
		System.out.println("Displaying shape");
	}
	//more code	
}
class PlayerPiece extends Shape{
	public void moveShape() {
		System.out.println("moving game piece");
	}
}
public class GameShapeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerPiece obj = new PlayerPiece();
		obj.displayShape();
		obj.moveShape();		
	}

}
