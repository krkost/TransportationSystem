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
		for (Vehicle v: vehicles) {
			v.printVehicle();
		}
	}

	public void sortVehiclesByPrice() {
		System.out.println("\nVehicles after sorting by Price:");
		for (int i = 0; i < vehicles.length; i++) {
			for (int j = 0; j < vehicles.length - 1; j++) {
				if (vehicles[j].getPrice() > vehicles[j + 1].getPrice()) {
					Vehicle tmp = vehicles[j];
					vehicles[j] = vehicles[j + 1];
					vehicles[j + 1] = tmp;
				}
			}
		}
	}
	
	public void sortVehiclesBySpeed() {
		System.out.println("\nVehicles after sorting by Speed:");
		for (int i = 0; i < vehicles.length; i++) {
			for (int j = 0; j < vehicles.length - 1; j++) {
				if (vehicles[j].getSpeed() > vehicles[j + 1].getSpeed()) {
					Vehicle tmp = vehicles[j];
					vehicles[j] = vehicles[j + 1];
					vehicles[j + 1] = tmp;
				}
			}
		}
	}

}
