package ExceptionHandling;

public class NestedDemo {

	private void process(int num) {
		try {
			try {
				if (num > 7) {
					throw new IllegalArgumentException("number should not be greater than 7");
				}
				try {
					System.out.println("In inner try block");
					int a = 7 / num;
					System.out.println("value of a " + a);
				} catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println("ArithmeticException " + e.getMessage());
					;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Exception in the code" + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Exception in the code" + e.getMessage());
		} finally {
			System.out.println("in outer finally");
		}
	}

	public static void main(String[] args) {
		NestedDemo nestedDemo = new NestedDemo();
		nestedDemo.process(10);
	}
}
