package by.htp.transport.entity;

public class Boat extends WaterVehicle {

	private String typeOfMaterial;

	Boat() {
		super();
	}

	public Boat(String make, int modelYear, int capacity, double speed, double price, double buoyancyReserve,
			String typeOfMaterial) {
		super(make, modelYear, capacity, speed, price, buoyancyReserve);
		this.typeOfMaterial = typeOfMaterial;
	}

	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

	@Override
	public void printVehicle() {
		System.out.println(
				"Make: " + this.getMake() + " Model Year: " + this.getModelYear() + " Capacity: " + this.getCapacity()
						+ " Speed: " + this.getSpeed() + " Price: " + this.getPrice() + " Buoyancy Reserve: "
						+ this.getBuoyancyReserve() + " Type of Boat Material: " + this.getTypeOfMaterial());

	}

}
