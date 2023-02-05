package tutorial;

import java.util.Scanner;

public class MarioExample {

	public static void main(String[] args)
	throws java.lang.Exception
	{
		// TODO Auto-generated method stub

		 try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
	        while(t-- >0){
	            int X = sc.nextInt();

	            if(X%3 ==0){
	                System.out.println("Height of Mario is normal.");
	            }
	            else if(X%3==1){
	                System.out.println("Height of Mario is Huge.");
	            }
	            else{
	                System.out.println("Height of Mario is small.");
	            }
	        }
		}

	}

}
