package part2;

interface Gift {
	void pack();

	void seal();
}

class GiftBox implements Gift {
	public void pack() {
		System.out.println("Gift pack box");
	}

	public void seal() {
		System.out.println("seal box");
	}
}
class DropBox {	
	public void paper() {
		System.out.println("Paper delivered successfully.");
	}
	public void Mobile() {
		System.out.println("Mobile delivered successfully.");
	}
}

public class Box {
	public void addPostage() {
		System.out.println("affix stamps");
	}

	public void ship() {
		System.out.println("put in mailbox");
	}

	public static void main(String[] args) {
		GiftBox obj = new GiftBox();
		obj.pack();
		obj.seal();
		Box obj2 = new Box();
		obj2.addPostage();
		obj2.ship();
		DropBox obj3 = new DropBox();
		obj3.paper();
		obj3.Mobile();
	}
}