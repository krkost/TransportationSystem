package by.htp.transport.entity;

public class Helicopter extends AirVehicle {

	private int numOfBlades;

	public Helicopter() {
		super();
	}

	public Helicopter(String make, int modelYear, int capacity, double speed, double price, double maxTakeOffHeight,
			String typeOfEngine, int numOfBlades) {
		super(make, modelYear, capacity, speed, price, maxTakeOffHeight, typeOfEngine);
		this.numOfBlades = numOfBlades;
	}

	public int getNumOfBlades() {
		return numOfBlades;
	}

	public void setNumOfBlades(int numOfBlades) {
		this.numOfBlades = numOfBlades;
	}

	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Max Take-Off Height: " + this.getMaxTakeOffHeight() + " Type of Helicopter Engine: " + this.getTypeOfEngine()
				+ " Number of Blades: " + this.getNumOfBlades());

	}

}
