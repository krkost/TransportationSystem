package by.htp.transport.entity;

public class Motorcycle extends GroundVehicle {

	private String registrationNumber;
	private String motorcycleType;

	public Motorcycle() {
		super();
	}

	public Motorcycle(String make, int modelYear, int capacity, double speed, double price, int countOfWheels,
			String typeOfEngine, String registrationNumber, String motorcycleType) {
		super(make, modelYear, capacity, speed, price, countOfWheels, typeOfEngine);
		this.registrationNumber = registrationNumber;
		this.motorcycleType = motorcycleType;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getMotorcycleType() {
		return motorcycleType;
	}

	public void setMotorcycleType(String motorcycleType) {
		this.motorcycleType = motorcycleType;
	}

	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Count of Wheels: " + this.getCountOfWheels() + " Type of Motorcycle Engine: " + this.getTypeOfEngine()
				+ " Registration Number: " + this.getRegistrationNumber() + " Motorcycle Type: "
				+ this.getMotorcycleType());

	}

}
