package by.htp.transport.entity;

public class Yacht extends WaterVehicle {
	
	private String typeOfEngine;
	
	public Yacht() {
		super();
	}
	
	public Yacht(String make, int modelYear, int capacity, double speed, double price, double buoyancyReserve,
			String typeOfEngine) {
		super(make, modelYear, capacity, speed, price, buoyancyReserve);
		this.typeOfEngine = typeOfEngine;
	}
	
	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
	
	@Override
	public void printVehicle() {
		System.out.println("Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: "
				+ this.getCapacity() + " Speed: " + this.getSpeed() + " Price: " + this.getPrice()
				+ " Buoyancy Reserve: " + this.getBuoyancyReserve() + " Type of Yacht Engine: " + this.getTypeOfEngine());

	}

}
