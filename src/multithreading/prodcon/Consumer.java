package multithreading.prodcon;

import java.util.Queue;

public class Consumer<T> implements Runnable {

	private Queue<T> queue;
	final private Object lock;

	@Override
	public void run() {
		while (true) {
			synchronized (lock) {
				while (queue.isEmpty()) {
					try {
						System.out.println("No Element Consumer is waiting");
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println("Consumed Element : " + queue.poll());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lock.notify();

			}
		}
	}

	public Consumer(Queue<T> queue, Object lock) {
		super();
		this.queue = queue;
		this.lock = lock;
	}

}
