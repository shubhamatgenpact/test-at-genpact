package ObjectClass;

public class Person {

	private String fname;
	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		return person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[fname = ]" + fname + ", lnam = " + lname + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setFname("Shubham");
		person.setLname("Nigam");
		System.out.println(person.toString());
	}
}
