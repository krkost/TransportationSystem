package by.htp.transport.entity;

public abstract class WaterVehicle extends Vehicle{
	
	private double buoyancyReserve;
	
	public WaterVehicle() {
		super();
	}
	
	public WaterVehicle(String make, int modelYear, int capacity, double speed, double price, double buoyancyReserve) {
		super(make, modelYear, capacity, speed, price);
		this.buoyancyReserve = buoyancyReserve;
	}
	
	public double getBuoyancyReserve() {
		return buoyancyReserve;
	}

	public void setBuoyancyReserve(double buoyancyReserve) {
		this.buoyancyReserve = buoyancyReserve;
	}

}
