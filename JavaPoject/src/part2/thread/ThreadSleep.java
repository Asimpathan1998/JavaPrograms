package part2.thread;

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x < 4; x++) {
			System.out.println("Run by " + Thread.currentThread().getName());

			try {
				Thread.sleep(1 * 1000);

			} catch (InterruptedException ex) {
			}
		}
	}
}

public class ThreadSleep {
	public static void main(String[] args) {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		one.setName("Fred");
		
		Thread two = new Thread(nr);
		two.setName("Lucy");
		
		Thread three = new Thread(nr);
		three.setName("Ricky");
		
		one.start();
		
		try {
			one.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		two.start();
		three.start();
	}
}
