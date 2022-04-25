import java.util.Scanner;

class Employee {
	int empId;
	String empName;
	float empSal;

	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}

public class HandOn2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int empId = sc.nextInt();
		System.out.println("Enter employee name");
		String empName = sc.next();
		System.out.println("Enter employee salary");
		float empSal = sc.nextFloat();
		
		if(empSal > 70000f) {
			System.out.println("Eligible for Scheme");
		}
		else {
			throw new NotEligibleForScheme("You're salary is less than 70000");
		}
	}
}
