package MethodHinding;

class X {
	protected static void m1(int a) {
		System.out.println("m1 of X");
	}
}

class Y extends X {
	protected static void m1(int a) {
		System.out.println();
	}
}

public class App3 {
	public static void main(String[] args) {
		X x = new Y();
		x.m1(10);

		Y y = new Y();
		y.m1(20);

	}
}
