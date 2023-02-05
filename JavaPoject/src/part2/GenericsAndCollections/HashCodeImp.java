package part2.GenericsAndCollections;

public class HashCodeImp {

	int sid;
	String sname;

	public HashCodeImp(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}
	@Override
	public String toString() {
		return sid + "     " + sname;
	}
	@Override
	public int hashCode() {
		return sid + sname.hashCode();
	}
	@Override	
	public boolean equals(Object o) {
		HashCodeImp hc = (HashCodeImp)o;
		
		if(this.sid == hc.sid && this.sname.equals(hc.sname)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		HashCodeImp hc1 = new HashCodeImp(101, "ram");
		HashCodeImp hc2 = new HashCodeImp(102, "sam");
		HashCodeImp hc3 = new HashCodeImp(101, "ram");
		System.out.println("Std  RollNo  Name   HashCode " );
		System.out.println("------------------------------------------------------");
		System.out.println("hc1: " + hc1 + "    " + hc1.hashCode() + "    "+ System.identityHashCode(hc1));
		System.out.println("hc2: " + hc2 + "    " + hc2.hashCode() + "    "+ System.identityHashCode(hc2));
		System.out.println("hc3: " + hc3 + "    " + hc3.hashCode() + "    "+ System.identityHashCode(hc3));
		
		System.out.println("\n" + hc1.equals(hc3));		
		
		
	}

}
