//problem on constructor
package part1.oops;

class Principle{
	String name;
	public Principle(String p) {
		name = p;
	}
	public Principle(){
		name = "unknown";
	}
}

public class StudentConst {
	
	
	public static void main(String[] args) {
		
		Principle p = new Principle("Dhoni");
		Principle a= new Principle();
		
		System.out.println(p.name);
		System.out.println(a.name);
	}

}
