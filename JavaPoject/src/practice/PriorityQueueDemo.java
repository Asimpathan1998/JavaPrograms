package practice;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String args[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(5);
		pq.add(14);
		pq.add(20);
		pq.add(100);
		pq.add(15);
		pq.add(5);
		
		System.out.println(pq);
		System.out.println(pq.peek());		//printing the top element in PriorityQueue
		
		System.out.println(pq.poll());
	}
}
