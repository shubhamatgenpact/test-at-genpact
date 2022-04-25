package MethodHinding;

class XX {
	public static void m1() {

	}

	public void m2() {

	}
}

class Demo extends XX {
	public static void m1() {
		System.out.println("App class m1 called");
	}

	public void m2() {
		System.out.println("App class m2 called");
	}

}

public class App extends XX {

	public static void main(String[] args) {

		XX x = new Demo();
		x.m1();
		x.m2();
	}
}
