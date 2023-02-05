package part2.GenericsAndCollections;

class Bob {
	int shoeSize;
	String nickName;
	String favoriteColor;
	
	Bob(String nickName, int shoeSize, String favoriteColor) {
		this.shoeSize = shoeSize;
		this.nickName = nickName;
		this.favoriteColor = favoriteColor;
	}

	public String toString() {
		return ("I am a Bob but you can call me " + nickName + ". My shoe size is " + shoeSize + " And My favorite color is " + favoriteColor + ".");
	}

}

public class BobTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bob b = new Bob("GoBobGo", 20, "Purple");
		System.out.println(b);
	}

}
