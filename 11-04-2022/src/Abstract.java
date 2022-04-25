
abstract class Identitiy {

	abstract void getGender(String gender);

	abstract void getName(String name);

	abstract void getCity(String city);

}

class Person extends Identitiy {

	@Override
	public void getGender(String gender) {
		System.out.println(gender);
	}

	@Override
	public void getName(String name) {
		System.out.println(name);
	}

	@Override
	public void getCity(String city) {
		System.out.println(city);
	}

	void getCountry(String country) {
		System.out.println("Country = " + country);
	}

}

public class Abstract {
	public static void main(String[] args) {
		Identitiy identitiy = new Person();
		identitiy.getName("Shubham Nigam");
		identitiy.getGender("Male");
		identitiy.getCity("Kanpur");
	}
}

/*
create abstract class MotorBike which have abstract method
--brakes
--gears
--clutches
--speed

non-abs
--company name

var
--color
--model

sub classes
--sports bike
--mountain bike
--water bikes

*/
