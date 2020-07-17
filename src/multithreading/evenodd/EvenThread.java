package multithreading.evenodd;

public class EvenThread implements Runnable {

	private IEvenOddPrinter printer;
	private int maxValue;

	public EvenThread(IEvenOddPrinter printer, int maxValue) {
		this.printer = printer;
		this.maxValue = maxValue;
	}

	@Override
	public void run() {
		int evenValue = 2;
		while (evenValue <= maxValue) {
			printer.printEven(evenValue);
			evenValue += 2;
		}

	}

}
