package by.htp.transport.entity;

public class Gyroscooter extends GroundVehicle{
	
	private String stabilizationSystem;
	
	public Gyroscooter() {
		super();
	}
	
	public Gyroscooter(String make, int modelYear, int capacity, double speed, double price, int countOfWheels,
			String typeOfEngine, String stabilizationSystem) {
		super(make, modelYear, capacity, speed, price, countOfWheels, typeOfEngine);
		this.stabilizationSystem = stabilizationSystem;
	}
	
	public String getStabilizationSystem() {
		return stabilizationSystem;
	}
	
	public void setStabilizationSystem(String stabilizationSystem) {
		this.stabilizationSystem = stabilizationSystem;
	}

	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Count of Wheels: " + this.getCountOfWheels() + " Stabilization System: " + this.getStabilizationSystem());
		
	}

}
