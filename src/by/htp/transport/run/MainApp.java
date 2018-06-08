package by.htp.transport.run;

import by.htp.transport.entity.*;
import by.htp.transport.logic.TransportLogic;

public class MainApp {

	public static void main(String[] args) {
		
	Vehicle[] vehicles = new Vehicle[4];
	
	vehicles[0] = new Car("Volvo", 2010, 5, 90, 10, 4, "Gas", "1111AA", "Hatchback");
	vehicles[1] = new Motorcycle("KAWASAKI AR50", 1970, 2, 100, 7, 2,
			"Gas", "1122AB", "Touring");
	vehicles[2] = new Plane("Boeing", 2000, 250, 900, 200, 12,
			"Kerosene", "Regional");
	vehicles[3] = new Ship ("Ship company", 1990, 70, 80, 300.5, 70, 2);
		
	TransportLogic transport = new TransportLogic();
	transport.setVehicles(vehicles);
	transport.printVehicles();
	transport.sortVehiclesByPrice();
	transport.printVehicles();
	transport.sortVehiclesBySpeed();
	transport.printVehicles();
	

	}

}
