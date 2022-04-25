
abstract class MotorBike {

	String color;
	String model;

	public MotorBike(String color, String model) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.model = model;
	}

	abstract void brakes();

	abstract void gears();

	abstract void clutches();

	abstract void speed();

	public void companyName() {

	}
}

class SportsBike extends MotorBike {

	public SportsBike(String color, String model) {
		super(color, model);
	}

	@Override
	void brakes() {
		System.out.println("Sports bike has disk brakes");
	}

	@Override
	void gears() {
		System.out.println("Sports bike has 5 gears");
	}

	@Override
	void clutches() {
		System.out.println("Sports bike has very expensive clutches");
	}

	@Override
	void speed() {
		System.out.println("Sports bike has 300 max speed");
	}

}

class MountainBike extends MotorBike {

	public MountainBike(String color, String model) {
		super(color, model);
	}

	@Override
	void brakes() {
		System.out.println("Mountain Bikes has Drum brakes");
	}

	@Override
	void gears() {
		System.out.println("Mountain bikes has 4 gears");
	}

	@Override
	void clutches() {
		System.out.println("Mountain Bikes cluthces are not expensive");
	}

	@Override
	void speed() {
		System.out.println("Mountain Bikes max speed is 100");
	}

}

class WaterBikes extends MotorBike {

	public WaterBikes(String color, String model) {
		super(color, model);
	}

	@Override
	void brakes() {
		System.out.println("WaterBikes has expensive and not very hard brakes");
	}

	@Override
	void gears() {
		System.out.println("Water Bikes has 3 gears");
	}

	@Override
	void clutches() {
		System.out.println("Mountain Bikes has cluthces are not expensive");
	}

	@Override
	void speed() {
		System.out.println("Mountain Bikes max speed is 150");
	}

}

public class Abstract2 {
	public static void main(String[] args) {
		SportsBike sportsBike = new SportsBike("Duke", "Orange");
		System.out.println("***Sports Bike Data***");
		System.out.println(sportsBike.model);
		System.out.println(sportsBike.color);
		sportsBike.brakes();
		sportsBike.clutches();
		sportsBike.companyName();
		sportsBike.gears();
		
		System.out.println();
		
		MountainBike mountainBike = new MountainBike("Himalyan", "Green");
		System.out.println("***Mountains Bike Data***");
		System.out.println(mountainBike.model);
		System.out.println(mountainBike.color);
		mountainBike.brakes();
		mountainBike.clutches();
		mountainBike.companyName();
		mountainBike.gears();
		
		System.out.println();
		
		WaterBikes waterBikes = new WaterBikes("Schiller", "Black");
		System.out.println("***Water Bike Data***");
		System.out.println(sportsBike.model);
		System.out.println(sportsBike.color);
		waterBikes.brakes();
		waterBikes.clutches();
		waterBikes.companyName();
		waterBikes.gears();
		
	}
}
