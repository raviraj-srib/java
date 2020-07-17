package multithreading.evenodd;

public class OddThread implements Runnable {

	private IEvenOddPrinter printer;
	private int maxValue;

	public OddThread(IEvenOddPrinter printer, int maxValue) {
		this.printer = printer;
		this.maxValue = maxValue;
	}

	@Override
	public void run() {
		int oddValue = 1;
		while (oddValue <= maxValue) {
			printer.printOdd(oddValue);
			oddValue += 2;
		}

	}

}
