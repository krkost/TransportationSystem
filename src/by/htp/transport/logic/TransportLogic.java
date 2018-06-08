package by.htp.transport.logic;

import by.htp.transport.entity.*;

public class TransportLogic {

	private Vehicle[] vehicles;

	public TransportLogic() {

	}

	public TransportLogic(Vehicle[] vehicles) {
		this.setVehicles(vehicles);
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public void printVehicles() {
		for (Vehicle v : vehicles) {
			v.printVehicle();
		}
	}

	public void sortVehiclesByPrice() {
		Vehicle[] tempVechiles = new Vehicle[this.getVehicles().length];
		tempVechiles = this.getVehicles();
		System.out.println("\nVehicles after sorting by Price:");
		for (int i = 0; i < vehicles.length; i++) {
			for (int j = 0; j < vehicles.length - 1; j++) {
				if (tempVechiles[j].getPrice() > tempVechiles[j + 1].getPrice()) {
					Vehicle tmp = tempVechiles[j];
					tempVechiles[j] = tempVechiles[j + 1];
					tempVechiles[j + 1] = tmp;
				}
			}
		}
	}

	public void sortVehiclesBySpeed() {
		Vehicle[] tempVechiles = new Vehicle[this.getVehicles().length];
		tempVechiles = this.getVehicles();
		System.out.println("\nVehicles after sorting by Speed:");
		for (int i = 0; i < vehicles.length; i++) {
			for (int j = 0; j < vehicles.length - 1; j++) {
				if (tempVechiles[j].getSpeed() > tempVechiles[j + 1].getSpeed()) {
					Vehicle tmp = tempVechiles[j];
					tempVechiles[j] = tempVechiles[j + 1];
					tempVechiles[j + 1] = tmp;
				}
			}
		}
	}

}
