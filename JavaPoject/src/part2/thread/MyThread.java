package part2.thread;

public class MyThread implements Runnable {

	public void run() {
		for (int x = 1; x < 100; x++) {
			System.out.println("Run by " + Thread.currentThread().getName());
		}
	}

	public void run(String s) {
		System.out.println("String in run is " + s);
	}

	public static void main(String[] args) {
		
		//System.out.println("Run by " + Thread.currentThread().getName());
		
		MyThread r = new MyThread();

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("Asim");
		t2.setName("Rajesh");
		t3.setName("Mahesh");
		 
		

		t1.start();
		
		/*
		 * try { t1.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		  
		 
		t2.start();
		t3.start();

	}
}
