package practice;

class Country {
	public void State() {
		String state[] = { "Maharastra", "Bihar", "Punjab", "Madhya Pradesh" };

		for (String str : state) {
			System.out.println(str);
		}
	}
}

public class EnhancedForLoop {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };

		for (int n : a) {
			System.out.println(n);
		}	

		Country obj = new Country();
		obj.State();
	}

}
