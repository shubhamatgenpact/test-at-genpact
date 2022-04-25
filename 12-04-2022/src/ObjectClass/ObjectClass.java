package ObjectClass;

public class ObjectClass {

	void m1(Object obj) {
		System.out.println(this == obj);
		System.out.println(obj == null);
	}

	public static void main(String[] args) {
		new ObjectClass().m1(null);

		String s1 = "shubham";
		String s2 = "shubham1";

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}
}
