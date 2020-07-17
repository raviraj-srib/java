package multithreading.evenodd;

public class EvenOddPrinterImlp implements IEvenOddPrinter {

	private volatile boolean evenFlag = false;

	public synchronized void printEven(int evenValue) {
	
		while (!evenFlag) {
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread Name : " + Thread.currentThread().getName() + "Value : " + evenValue);
		evenFlag = false;
		notify();
	}

	public synchronized void printOdd(int oddValue) {
		while (evenFlag) {
			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread Name : " + Thread.currentThread().getName() + "Value : " + oddValue);
		evenFlag = true;
		notify();
	}

}
