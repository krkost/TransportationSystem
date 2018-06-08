package by.htp.transport.entity;

public class MetroTrain extends Train {

	private double maxImmersionDepth;

	public MetroTrain() {
		super();
	}

	public MetroTrain(String make, int modelYear, int capacity, double speed, double price, int numOfAxles,
			int numOfWagons, double maxImmersionDepth) {
		super(make, modelYear, capacity, speed, price, numOfAxles, numOfWagons);
		this.maxImmersionDepth = maxImmersionDepth;

	}

	public double getMaxImmersionDepth() {
		return maxImmersionDepth;
	}

	public void setMaxImmersionDepth(double maxImmersionDepth) {
		this.maxImmersionDepth = maxImmersionDepth;
	}

	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Number of Axles: " + this.getNumOfAxles() + " Number of Wagons: " + this.getNumOfWagons()
				+ " Maximum Immersion Depth: " + this.getMaxImmersionDepth());

	}

}
