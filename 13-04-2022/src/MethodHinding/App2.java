package MethodHinding;

class Parent {
	public static void classMethod() {
		System.out.println("class method in parent class");
	}

	public void nonStatic() {
		System.out.println("Instance method in parent class");
	}
}

class Child extends Parent {
	public static void classMethod() {
		System.out.println("class method in child class");
	}

	public void nonStatic() {
		System.out.println("Instance method in child class");
	}
}

public class App2 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.classMethod(); // parent
		p.nonStatic(); // child

		System.out.println();

		Child c = new Child();
		c.classMethod(); // child
		c.nonStatic(); // child

		System.out.println();

		Parent p1 = new Parent();
		p1.classMethod(); // parent
		p1.nonStatic();// parent
	}
}
// in overloading and hiding method res is taken care by runtime reference
// in overriding method res is taken care by runtime object

