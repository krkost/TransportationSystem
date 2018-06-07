package by.htp.transport.entity;

public abstract class GroundVehicle extends Vehicle {

	private int countOfWheels;
	private String typeOfEngine;

	public GroundVehicle() {
		super();
	}

	public GroundVehicle(String make, int modelYear, int capacity, double speed, double price, int countOfWheels,
			String typeOfEngine) {
		super(make, modelYear, capacity, speed, price);
		this.countOfWheels = countOfWheels;
		this.typeOfEngine = typeOfEngine;
	}

	public int getCountOfWheels() {
		return countOfWheels;
	}

	public void setCountOfWheels(int countOfWheels) {
		this.countOfWheels = countOfWheels;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
}
