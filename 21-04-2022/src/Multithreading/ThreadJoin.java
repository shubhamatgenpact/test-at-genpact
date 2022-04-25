package Multithreading;

public class ThreadJoin implements Runnable {

	@Override
	public void run() {
		System.out.println("Child Thread Running");
		for (int i = 1; i <= 4; i++) {
			System.out.println("I " + i);
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Child Thread Ending");

	}

	public static void main(String[] args) {
		ThreadJoin threadJoin = new ThreadJoin();
		Thread thread = new Thread();

		thread.start();

		try {
			thread.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main Thread is Ending");

	}

}
