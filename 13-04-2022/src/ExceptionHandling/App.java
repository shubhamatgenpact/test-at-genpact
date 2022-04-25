package ExceptionHandling;

public class App {
	public static void main(String[] args) {
		try {
			System.out.println("in outer try block");
			try {
				System.out.println("in inner try block");
				int a = 7 / 0;
			} catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			} finally {
				System.out.println("in inner finally");
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
			// TODO: handle exception
		} finally {
			System.out.println("in outer finally");
		}
	}
}
