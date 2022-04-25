package Multithreading;

class MyThread implements Runnable {

	public void run() {
		while (!Thread.currentThread().interrupted()) {
			System.out.println("Thread is running");
		}
		System.out.println("Thread has stopped.");
	}
}

public class StopThread {
	public static void main(String args[]) throws InterruptedException {

		MyThread t1 = new MyThread();
		Thread thread = new Thread(t1);
		thread.start();

		Thread.sleep(1);

		thread.interrupt();

		Thread.sleep(5);

		System.out.println("Exiting the main Thread");
	}
}
