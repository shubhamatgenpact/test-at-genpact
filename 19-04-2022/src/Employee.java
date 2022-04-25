
public class Employee {
	int empId;
	String empName;
	int empSal;
	int empExp;

	public Employee(int empId, String empName, int empSal, int empExp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empExp = empExp;
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

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public int getEmpExp() {
		return empExp;
	}

	public void setEmpExp(int empExp) {
		this.empExp = empExp;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empExp=" + empExp + "]";
	}

}
