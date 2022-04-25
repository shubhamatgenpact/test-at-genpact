package Multithreading;

class PreTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println("First Child " + i);
		}
		System.out.println("First Child Existed");

	}

}

class PostTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println("Second Child " + i);
		}
		System.out.println("Second Child Existed");
	}

}

public class FinalTest {
	public static void main(String[] args) {
		PreTest t1 = new PreTest();
		Thread t = new Thread(t1);

		t.start();

		PostTest t2 = new PostTest();
		Thread tt = new Thread(t2);
		tt.start();

		int j = 0;
		while (j < 4) {
			System.out.println("Main Thread " + j);
			j = j + 1;
		}

	}
}
