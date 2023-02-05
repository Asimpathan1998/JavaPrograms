package solvingproblems;
import java.util.Scanner;

public class DivisionOfNum {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			 
			int div;
			
			div = a/b;
			 
			System.out.println("Your division is approx: " + div);
		}
	}
	
}
//Calculate: a / b
/*public int divide (int a, int b) {
if ( a < b ) {
    return 0;
} else {
    return 1 + divide ( a - b, b );
}
} */