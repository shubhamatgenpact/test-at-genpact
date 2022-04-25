
interface interf {
	default void m1() {
		System.out.println("this is m1 default method");
	}

	static void m2() {
		System.out.println("this is static method");
	}
}
class Demo1 implements interf{
	
}

public class Interface {
	public static void main(String[] args) {

		// default method available in child classes but can't be call using interface
		// name
		new Demo1().m1();

		// static method won't available in child classes
		interf.m2();
	}
}
