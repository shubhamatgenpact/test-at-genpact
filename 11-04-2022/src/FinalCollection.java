import java.util.Scanner;

interface IncomeTax {
	double ITTax();
}

class Engineer implements IncomeTax {

	@Override
	public double ITTax() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Doctor implements IncomeTax {

	@Override
	public double ITTax() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Lawyers implements IncomeTax {

	@Override
	public double ITTax() {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class FinalCollection {

	static void calcuateTax() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the professor name :");
		String prof = sc.next();
	}
}
