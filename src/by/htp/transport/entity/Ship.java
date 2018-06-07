package by.htp.transport.entity;

public class Ship extends WaterVehicle {

	private int numOfMasts;

	public Ship() {
		super();
	}

	public Ship(String make, int modelYear, int capacity, double speed, double price, double buoyancyReserve,
			int numOfMasts) {
		super(make, modelYear, capacity, speed, price, buoyancyReserve);
		this.numOfMasts = numOfMasts;
	}

	public int getNumOfMasts() {
		return numOfMasts;
	}

	public void setNumOfMasts(int numOfMasts) {
		this.numOfMasts = numOfMasts;
	}

	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Buoyancy Reserve: " + this.getBuoyancyReserve() + " Number of Masts: " + this.getNumOfMasts());

	}

}
