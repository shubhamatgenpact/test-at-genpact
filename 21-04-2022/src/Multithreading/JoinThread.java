package Multithreading;

class MyClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		System.out.println("Thread Started = " + thread.getName());
	
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class JoinThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass(), "Thread 1");
		Thread t2 = new Thread(new MyClass(), "Thread 2");
		Thread t3 = new Thread(new MyClass(), "Thread 3");

		t1.start();

		try {
			t1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();

		try {
			t2.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();

		try {
			t3.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("All three thread has finished execution");
	}
}
