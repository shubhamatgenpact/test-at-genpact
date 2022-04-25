
@FunctionalInterface
interface MyInterface {

	public default int countCash(int cash) {
		return cash;
	}

	default void countAge(int year) {
		year = 2022 - year;
		System.out.println("You are " + year + " years old");

	}

	int add(int x, int y);
}

public class Interface2 {
	public static void main(String[] args) {
		MyInterface myInterface = (a, b) -> {
			return ((a * a) + (b * b) + 2 * a * b);
		};

		System.out.println(myInterface.add(2, 2));
	}
}
