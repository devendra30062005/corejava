package collection;

import java.util.LinkedList;

public class TestQueue {
	public static void main(String[] args) {
	LinkedList queue = new LinkedList();

	// Add elements to queue
	queue.offer("Ram");
	queue.offer("Shyam");
	queue.offer("Jai");
	queue.offer("Vijay");

	// get the head but do not remove
	System.out.println(queue.peek());

	// get and remove the head
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());

}

}


