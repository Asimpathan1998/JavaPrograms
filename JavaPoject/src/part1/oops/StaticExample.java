package part1.oops;

public class StaticExample {

	static int count;
	
	StaticExample(){
		
		 	count++;
		 System.out.println("total object created: " +count);	
	 }
	
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample obj = new StaticExample();
		//StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		
	//System.out.println("total object created: " +count);
		
	}

}
