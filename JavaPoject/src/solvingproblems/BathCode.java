package solvingproblems;
import java.util.Scanner;

public class BathCode {
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here
		Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=b*2;
		    if(a<c)
		    {
		        System.out.println("0");
		    }
		    else
		    {
		        int d=a/c;
		        System.out.println("Output is:"+ d);
		    }
		}
		
	}
}

