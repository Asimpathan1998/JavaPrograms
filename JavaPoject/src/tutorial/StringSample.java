package tutorial;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Asim");
		String s2 = "Asim";
		String s3 = "Asim";
		String s4 = new String("Asim");
		if(s2 == s3) {
			
			System.out.println("S2 & S3 are equal object ");
			
		}else {
			System.out.println("S2 & S3 are not equal object ");
		}
		if(s1 == s4) {
			System.out.println("s1 and s4 are equal");
		}
	}

}
