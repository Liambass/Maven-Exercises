//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). Each derived class should have its own attributes in addition to the normal Vehicle attributes.
//
//Using a List<> implementation, store all your Vehicles in a Garage class.
//
//Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, depending on the type of Vehicle it is (this does not need to be complex).
//
//Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.
//
//Garage should have a method to remove multiple Vehicles by their type.


package com.liambass.main;

import com.liambass.garage.Garage;
import com.liambass.vehicles.*;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car bmw = new Car(4, "BMW", "Black", 5);
		Car volvo = new Car(4, "Volvo", "Blue", 5);
		Van transit = new Van(4, "Ford", 3.5, "Long");
		Car robin  = new Car(4, "Reliant", "Olive", 3);
		Motorcycle yam  = new Motorcycle(2, 500, "Yamaha", "Red");
		Motorcycle harl = new Motorcycle(3, 600, "Harley-Davidson", "Black");
		
		garage.addVehicle(bmw);
		garage.addVehicle(volvo);
		garage.addVehicle(transit);
		garage.addVehicle(robin);
		garage.addVehicle(yam);
		garage.addVehicle(harl);
		
		garage.allBills();
		
		garage.print();
		
		garage.removeByID(volvo.getId());
		
		garage.print();
		
		garage.removeByType("Motorcycle");
		
		garage.print();
		
		garage.fixVehicle(robin.getId());
		
		garage.print();
		
		garage.emptyGarage();
		
		garage.print();
		
	}

}
