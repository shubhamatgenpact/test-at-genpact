package Multithreading;

class Demo {
	void disp1(Demo d1) {
		System.out.println("Thread 1 waiting for thread 2 to release lock");

		synchronized (d1) {
			System.out.println("Deadlock Occured");
		}
	}

	void disp2(Demo d1) {
		System.out.println("Thread 2 waiting for thread 1 to release lock");

		synchronized (d1) {
			System.out.println("Deadlock Occured");
		}
	}
}

class Thread1 extends Thread {
	Demo d1, d2;

	public Thread1(Demo d1, Demo d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	public void run() {
		synchronized (d1) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			d2.disp2(d1);
		}
	}
}

class Thread2 extends Thread {
	Demo d1, d2;

	public Thread2(Demo d1, Demo d2) {
		// TODO Auto-generated constructor stub
		this.d1 = d1;
		this.d2 = d2;
	}

	public void run() {
		synchronized (d2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			d1.disp1(d1);
		}
	}
}

public class Deadlock {
	Demo obj1 = new Demo();
	Demo obj2 = new Demo();

	Thread t1 = new Thread(obj1, obj2);
}
