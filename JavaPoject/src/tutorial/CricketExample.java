package tutorial;

import java.util.Scanner;

class CricketExample
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum;
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter x value:");
			   int x=sc.nextInt();
			   
			   System.out.println("Enter y value:" );
			   int y=sc.nextInt();
			   
			   
			   sum = x - y ;
			   if(x<y) {
				   System.out.println("y won the match by:" + Math.abs(sum));
			   }
			   else {
				   System.out.println("x won the match by:" + Math.abs(sum));
			   }
		}
        }
}
