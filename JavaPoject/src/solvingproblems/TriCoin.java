package solvingproblems;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TriCoin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (
		Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			for(int i=0; i<t; i++){
			    int n = sc.nextInt();
			    int sum=1; int r = 0;
			 while(n>=1 && n>=sum){
			    n= n-sum;
			        sum++;
			        r++;
			}    
			    System.out.println(r);
			}
		}
		
	}
}