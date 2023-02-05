package solvingproblems;

class Maths{
	int x,t;
	 
	public void mathsPb(int x, int t){
		for(int i=0; i<t; i++) {
		
			if(x%20 !=0) {
				
				System.out.println((x/25)+1);
			}
			else {
				System.out.println(x/25);
			}
			
		}
		
	}
	 
}

public class RankList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths sc = new Maths();
		 sc.mathsPb(121, 5);
		
	}

}
