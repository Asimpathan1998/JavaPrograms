package part2.Collections;

class Special{
	private StringBuilder s = new StringBuilder("Bob");
	StringBuilder getName() {
		return s;
	}
	void printName() {
		System.out.println(s);
	}
}
public class ArrayListPb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Special sp = new Special();
		StringBuilder s2 = sp.getName();
		s2.append("fred");
		sp.printName();
	}

}
