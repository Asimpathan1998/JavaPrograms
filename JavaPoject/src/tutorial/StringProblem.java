package tutorial;

class StringOne{
	void createString() {
		String First = "Java";						//create string
		String Second = "Python";
		String Third = "Angular";
		
													// print string
		System.out.println(First);
		System.out.println(Second);
		System.out.println(Third);
	}
		StringOne() {
			System.out.println("Print String: ");
		}
}
public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringOne str = new StringOne();
		str.createString();
	}

}
