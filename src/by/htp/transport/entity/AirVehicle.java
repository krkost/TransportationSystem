package by.htp.transport.entity;

public abstract class AirVehicle extends Vehicle {
	
	private double maxTakeOffHeight;
	private String typeOfEngine;
	
	public AirVehicle() {
		super();
	}
	
	public AirVehicle(String make, int modelYear, int capacity, double speed, double price, double maxTakeOffHeight,
			String typeOfEngine) {
		super(make, modelYear, capacity, speed, price);
		this.typeOfEngine = typeOfEngine;
		this.maxTakeOffHeight = maxTakeOffHeight;
	}
	
	public double getMaxTakeOffHeight() {
		return maxTakeOffHeight;
	}

	public void setMaxTakeOffHeight(double maxTakeOffHeight) {
		this.maxTakeOffHeight = maxTakeOffHeight;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
	
	

}
