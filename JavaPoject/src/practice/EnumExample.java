package practice;

class FreshJuice {
	enum FreshJuiceSize {
		SMALL, MEDIUM, LARGE
	};

	FreshJuiceSize size;
}

public class EnumExample {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.SMALL;
		System.out.println("Size: " + juice.size);

	}

}

