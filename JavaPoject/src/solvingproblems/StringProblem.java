package solvingproblems;
public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//String Declaration
		//Scanner sc = new Scanner(System.in);
			//String name = sc.nextLine();  //if your want to take only one word as input so use sc.next and for more than one use sc.nextLine
			//System.out.println("Your name is: " + name);
			
		/*	String firstName = "Asim";
			String lastName = "Pathan";
			String fullName = firstName + " " + lastName;
			System.out.println(fullName.length()+"\n");
			
			//charAt
			for(int i = 0; i<fullName.length(); i++) {
				System.out.println(fullName.charAt(i));
		*/
		
		
		//compare
		String name1 = "Asim";
		String name2 = "Asim";
		
		//1 s1 > s2 : +ve value
		//2 s1 == s2 : 0
		//3 s1 < s2 : -ve value
		
	/*	if(name1.compareTo(name2) == 0) {
			System.out.println("String are equal");	
			}else {
				System.out.println("String are not equal");
			}
			*/
		
		if(name1== name2) {
			System.out.println("String are equal");	
			}else {
				System.out.println("String are not equal");
			}
	}

}
