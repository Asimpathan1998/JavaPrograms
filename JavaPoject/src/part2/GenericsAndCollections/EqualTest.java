package part2.GenericsAndCollections;

class Moof{
	private int moofValue;
	
	public Moof(int val) {
		moofValue = val;
	}
	public int getMoofValue() {
		return moofValue;
	}
	public boolean equals(Object o) {
		if((o instanceof Moof) && (((Moof)o).getMoofValue()== this.moofValue)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class EqualTest {

	public static void main(String[] args) {
		Moof one = new Moof(5);
		Moof two = new Moof(5);
		
		if(one.equals(two)) {
			System.out.println("One and two is equal");
		}
		else {
			System.out.println("One and two is not equal");
		}
	}

}
