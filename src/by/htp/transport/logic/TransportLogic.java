package by.htp.transport.logic;

import java.util.ArrayList;

import by.htp.transport.entity.*;

public class TransportLogic {

	private ArrayList<Vehicle> arrVehicles;

	public TransportLogic() {

	}

	public TransportLogic(ArrayList<Vehicle> arrVehicles) {
		this.setVehicles(arrVehicles);
	}

	public ArrayList<Vehicle> getVehicles() {
		return arrVehicles;
	}

	public void setVehicles(ArrayList<Vehicle> arrVehicles) {
		this.arrVehicles = arrVehicles;
	}

	public void printVehicles() {
		for (Vehicle v : arrVehicles) {
			v.printVehicle();
		}
	}

	public void sortVehiclesByPrice() {
		Vehicle[] vehicles = new Vehicle[arrVehicles.size()];
		for (int i = 0; i < arrVehicles.size(); i++) {
			vehicles[i] = arrVehicles.get(i);
		}

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
		arrVehicles.removeAll(arrVehicles);
		for (int i = 0; i < vehicles.length; i++) {
			arrVehicles.add(vehicles[i]);
		}
		// for (int i = 0; i < arrVehicles.size(); i++) {
		// for (int j = 0; j < arrVehicles.size() - 1; j++) {
		// if (arrVehicles.get(j).getPrice() > arrVehicles.get(j+1).getPrice()) {
		// Vehicle tmp = arrVehicles.get(j);
		// arrVehicles.add(j, arrVehicles.get(j+1));
		// arrVehicles.add(j+1, tmp);
		// }
		// }
		// }
	}

	public void sortVehiclesBySpeed() {
		Vehicle[] vehicles = new Vehicle[arrVehicles.size()];
		for (int i = 0; i < arrVehicles.size(); i++) {
			vehicles[i] = arrVehicles.get(i);
		}
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
		arrVehicles.removeAll(arrVehicles);
		for (int i = 0; i < vehicles.length; i++) {
			arrVehicles.add(vehicles[i]);
		}
	}

}
