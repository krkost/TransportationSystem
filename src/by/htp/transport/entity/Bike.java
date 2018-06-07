package by.htp.transport.entity;

public class Bike extends GroundVehicle{
	
	String typeOfBike;
	
	public Bike() {
		super();
	}
	
	public Bike(String make, int modelYear, int capacity, double speed, double price, int countOfWheels,
			String typeOfEngine, String typeOfBike) {
		super(make, modelYear, capacity, speed, price, countOfWheels, typeOfEngine);
		this.typeOfBike = typeOfBike;
	}
	
	public String getTypeOfBike() {
		return typeOfBike;
	}
	
	public void setTypeOfBike(String typeOfBike) {
		this.typeOfBike = typeOfBike;
	}
	
	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Count of Wheels: " + this.getCountOfWheels() + " Type of Engine: " + this.getTypeOfEngine()
				+ " Type of Bike: " + this.getTypeOfBike());

	}
}
