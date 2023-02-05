package part1.oops;

public class Init {
	
	Init(int x){
		System.out.println("1 - args const");
	}
				//	problem on constructor
	 Init() {
		
		 System.out.println("no args const");
	}
	 static {
		 System.out.println("1st static init");
	 }
	 {
		 System.out.println("1st instance init");
	 }
	 {
		 System.out.println("2nd instance init");
	 }
	
	public static void main(String[] args) {
		
		new Init();
		new Init(2);
	}

}
