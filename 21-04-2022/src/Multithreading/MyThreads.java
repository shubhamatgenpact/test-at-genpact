package Multithreading;

public class MyThreads implements Runnable {
	public static void main(String[] args) {

		MyThreads m1 = new MyThreads();
		Thread t1 = new Thread(m1);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
