package TestCircularQueue;

import CircularQueue.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		
		CircularQueue cqueue= new CircularQueue(10);

		
		cqueue.enqueue(9);
		cqueue.enqueue(8);
		cqueue.enqueue(7);
		cqueue.enqueue(6);
		cqueue.enqueue(5);
		cqueue.enqueue(4);
		
		while (!cqueue.isEmpty()) {
		    System.out.print(cqueue.dequeue() + " ");
		}
		System.out.println();
		
	}

}
