package Multithreading;

public class PriorityTest implements Runnable {

	public static void main(String[] args) {
			PriorityTest priorityTest = new PriorityTest();
			
			Thread t1 = new Thread(priorityTest,"First Thread");
			Thread t2 = new Thread(priorityTest,"Second Thread");
			Thread t3 = new Thread(priorityTest,"Third Thread");
			
			t1.setPriority(4);
			t2.setPriority(2);
			t3.setPriority(8);
			
		
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());

	}
}
