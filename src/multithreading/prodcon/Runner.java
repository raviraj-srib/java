package multithreading.prodcon;

import java.util.PriorityQueue;
import java.util.Queue;

public class Runner {

	public static void main(String[] args) {
		final Object lock = new Object();
		Queue<Integer> queue = new PriorityQueue<>();
		
		new Thread(new Producer<Integer>(queue,lock, 10), "Producer Thread").start();
		new Thread(new Consumer<Integer>(queue,lock), "Consumer Thread").start();

	}
	

}
