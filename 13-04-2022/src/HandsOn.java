
/*
parent class child class new child class and method hiding we have to do 
2 non static
1 static 
1 instance variable
*/

class Parent {

	public int instanceVar = 10;

	public void nonStatic1() {
		System.out.println("nonstatic 1 of Parent class");
	}

	public void nonStatic2() {
		System.out.println("nonstatic 2 of Parent class");
	}

	public static void static1() {
		System.out.println("static1 of Parent class");
	}
}

class Child extends Parent {

	public int instanceVar = 100;

	public void nonStatic1() {
		System.out.println("nonstatic 1 of Child class");
	}

	public void nonStatic2() {
		System.out.println("nonstatic 2 of Child class");
	}

	public static void static1() {
		System.out.println("static1 of Child class");
	}
}

public class HandsOn {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.nonStatic1(); // parent
		p1.nonStatic2(); // parent
		p1.static1(); // parent
		System.out.println(p1.instanceVar);
		System.out.println();

		Child c1 = new Child();
		c1.nonStatic1();
		c1.nonStatic2();
		c1.static1();
		System.out.println(c1.instanceVar);

		System.out.println();

		Parent p2 = new Child();
		p2.nonStatic1(); // child
		p2.nonStatic1(); // child
		p2.static1();
		System.out.println(p2.instanceVar);

	}
}
