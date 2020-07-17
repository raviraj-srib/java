package multithreading.prodcon;

import java.util.Queue;
import java.util.Random;

public class Producer<T> implements Runnable {
	private Queue queue;
	final private int QUEUE_SIZE;
	final private Object lock;

	final Random random = new Random();

	public Producer(Queue queue, Object lock, int queueSize) {
		super();
		this.queue = queue;
		this.QUEUE_SIZE = queueSize;
		this.lock = lock;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (lock) {
				while (queue.size() >= QUEUE_SIZE) {
					try {
						System.out.println("Queue full, Producer is waiting");
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int element = random.nextInt();
				System.out.println("Produced Element : " + element);
				queue.add(element);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lock.notify();

			}
		}
	}

}
