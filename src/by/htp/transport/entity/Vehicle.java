package by.htp.transport.entity;

public abstract class Vehicle {
	
	private String make;
	private int modelYear;
	private int capacity;
	private double speed;
	private double price;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String make, int modelYear, int capacity, double speed, double price) {
		this.make = make;
		this.modelYear = modelYear;
		this.capacity = capacity;
		this.speed = speed;
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public abstract void printVehicle();
}
