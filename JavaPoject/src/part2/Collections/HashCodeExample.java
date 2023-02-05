package part2.Collections;

import java.util.ArrayList;
import java.util.List;

class HasHash {
	public int x;

	HasHash(int xVal) {
		x = xVal;
	}

	public boolean equals(Object o) {
		HasHash h = (HasHash) o;

		if (h.x == this.x)

		{
			return true;
		} else {
			return false;
		}
	}
	public int hashCode() {
		return (x * 17); }
}

	public class HashCodeExample {
		public static void main(String args[]) {
			List<String> tree = new ArrayList<String>();
			tree.add("Banaya");
			tree.add("Neem");
			tree.add("papaya");
			tree.add("babul");
			tree.add("Coconut");

			System.out.println("Trees HashCode: " + tree.hashCode());
			System.out.println("Trees Like: " + tree);
			System.out.println("Trees Like: " + tree.get(2));
			System.out.println(tree.hashCode());
			
			HasHash obj = new HasHash(1);
			
			
			System.out.println(obj.hashCode());
			
		}
	}

