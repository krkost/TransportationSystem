package by.htp.transport.run;

import java.util.ArrayList;

import by.htp.transport.entity.*;
import by.htp.transport.logic.TransportLogic;

public class MainApp {

	public static void main(String[] args) {

		ArrayList<Vehicle> arrVehicles = new ArrayList<Vehicle>();

		Car car = new Car("Volvo", 2010, 5, 90, 10, 4, "Gas", "1111AA", "Hatchback");
		Motorcycle motorcycle = new Motorcycle("KAWASAKI AR50", 1970, 2, 100, 7, 2, "Gas", "1122AB", "Touring");
		Gyroscooter gyroscooter = new Gyroscooter("China company", 2017, 1, 7, 100, 2, "Electro", "Power Stabilization System");
		Bike bike = new Bike("BMX", 1999, 1, 31, 250, 2, "NO engine", "street");
		Plane plane = new Plane("Boeing", 2000, 250, 900, 200, 12, "Kerosene", "Regional");
		Helicopter helicopter = new Helicopter ("Company&Co", 1997, 6, 300, 350, 2, "Kerosene", 3);
		Ship ship = new Ship("Ship company", 1990, 70, 80, 300.5, 70, 2);
		Boat boat = new Boat("Boat Co", 2007, 4, 20, 34, 60, "Rubber");
		Yacht yacht = new Yacht("Great Yachts", 2011, 28, 67, 510, 65, "Diesel");
		Train train = new Train("State Company", 2000, 300, 110, 5, 40, 7);
		MetroTrain metroTrain = new MetroTrain("Test Company", 1995, 211, 70, 1, 26, 5, 30);

		arrVehicles.add(car);
		arrVehicles.add(motorcycle);
		arrVehicles.add(gyroscooter);
		arrVehicles.add(bike);
		arrVehicles.add(plane);
		arrVehicles.add(helicopter);
		arrVehicles.add(ship);
		arrVehicles.add(boat);
		arrVehicles.add(yacht);
		arrVehicles.add(train);
		arrVehicles.add(metroTrain);

		TransportLogic transport = new TransportLogic();
		transport.setVehicles(arrVehicles);
		transport.printVehicles();
		transport.sortVehiclesByPrice();
		transport.printVehicles();
		transport.sortVehiclesBySpeed();
		transport.printVehicles();

	}

}
