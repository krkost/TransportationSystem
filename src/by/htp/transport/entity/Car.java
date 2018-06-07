package by.htp.transport.entity;

public class Car extends GroundVehicle {

	private String registrationNumber;
	private String carBodyStyle;

	public Car() {
		super();
	}

	public Car(String make, int modelYear, int capacity, double speed, double price, int countOfWheels,
			String typeOfEngine, String registrationNumber, String carBodyStyle) {
		super(make, modelYear, capacity, speed, price, countOfWheels, typeOfEngine);
		this.registrationNumber = registrationNumber;
		this.carBodyStyle = carBodyStyle;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String getCarBodyStyle() {
		return carBodyStyle;
	}
	
	public void setCarBodyStyle(String carBodyStyle) {
		this.carBodyStyle = carBodyStyle;
	}
	
	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Count of Wheels: " + this.getCountOfWheels() + " Type of Car Engine: " + this.getTypeOfEngine()
				+ " Registration Number: " + this.getRegistrationNumber() + " Car Body Style: "
				+ this.getCarBodyStyle());

	}
}
