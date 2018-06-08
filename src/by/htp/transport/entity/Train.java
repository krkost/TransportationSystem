package by.htp.transport.entity;

public class Train extends Vehicle {

	private int numOfAxles;
	private int numOfWagons;

	public Train() {
		super();
	}

	public Train(String make, int modelYear, int capacity, double speed, double price, int numOfAxles,
			int numOfWagons) {
		super(make, modelYear, capacity, speed, price);
		this.numOfAxles = numOfAxles;
		this.numOfWagons = numOfWagons;
	}

	public int getNumOfAxles() {
		return numOfAxles;
	}

	public void setNumOfAxles(int numOfAxles) {
		this.numOfAxles = numOfAxles;
	}

	public int getNumOfWagons() {
		return numOfWagons;
	}

	public void setNumOfWagons(int numOfWagons) {
		this.numOfWagons = numOfWagons;
	}

	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Number of Axles: " + this.getNumOfAxles() + " Number of Wagons: " + this.getNumOfWagons());

	}
}
