package multithreading.evenodd;

public class Runner {
	
	public static void main(String[] args) {
		IEvenOddPrinter printer = new EvenOddPrinterImlp();
		new Thread(new EvenThread(printer, 150), "Even Thread").start();
		new Thread(new OddThread(printer,150), "Odd Thread").start();

	}

}
