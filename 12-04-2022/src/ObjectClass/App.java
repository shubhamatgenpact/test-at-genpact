package ObjectClass;

class Persons {
	public Persons() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize called");
		super.finalize();
	}

}

public class App {
	public static void main(String[] args) {
		Persons p3 = new Persons();
		Persons p4 = new Persons();

		p3 = p4;
		p3 = null;
		p4 = null;

		System.gc();

	}
}
