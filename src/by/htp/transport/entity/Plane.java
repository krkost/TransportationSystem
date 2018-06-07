package by.htp.transport.entity;

public class Plane extends AirVehicle {

	private String typeOfPlane;

	public Plane() {
		super();
	}

	public Plane(String make, int modelYear, int capacity, double speed, double price, double maxTakeOffHeight,
			String typeOfEngine, String typeOfPlane) {
		super(make, modelYear, capacity, speed, price, maxTakeOffHeight, typeOfEngine);
		this.typeOfPlane = typeOfEngine;
	}

	public String getTypeOfPlane() {
		return typeOfPlane;
	}

	public void setTypeOfPlane(String typeOfPlane) {
		this.typeOfPlane = typeOfPlane;
	}

	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Max Take-Off Height: " + this.getMaxTakeOffHeight() + " Type of Engine: " + this.getTypeOfEngine()
				+ " Type of Plane: " + this.getTypeOfPlane());

	}

}
