//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). Each derived class should have its own attributes in addition to the normal Vehicle attributes.
//
//Using a List<> implementation, store all your Vehicles in a Garage class.
//
//Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, depending on the type of Vehicle it is (this does not need to be complex).
//
//Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.
//
//Garage should have a method to remove multiple Vehicles by their type.



package com.liambass.garage;

import java.util.ArrayList;

import com.liambass.vehicles.*;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
		public void addVehicle(Vehicle v) {
			this.vehicles.add(v);
		}
		
		public void removeByID(int id) {
			for (Vehicle v : vehicles) {
				if (v.getId() == id) {
					vehicles.remove(v);
					System.out.println("Entry deleted");
					return;
				}
			}
			System.out.println("No such ID");
		}
		
		public void removeByType(String type) {
			int i = 0;
			ArrayList<Vehicle> remove = new ArrayList<Vehicle>();
			for (Vehicle v : vehicles) {
				if (v.getType() == type) {
					remove.add(v);
					i++;
				}
			}
			for (Vehicle v : remove) {
				vehicles.remove(v);
			}
			System.out.println((i == 0)? "No records of type: " + type + " found" : i + " records of type: " + type + " deleted");
		}
		
		public void emptyGarage() {
			vehicles.clear();
		}
		
		public void allBills() {
			for (Vehicle v : vehicles) {
				v.bills();
			}
		}
		
		public void fixVehicle(int id) {
			for (Vehicle v : vehicles) {
				if (v.getId() == id) {
					System.out.println("The customer's repair bill is: £" + v.fixCost()); ;
					vehicles.remove(v);
					return;
				}
			}
			System.out.println("No such ID");
		}

		public void print() {
			for (Vehicle v : vehicles) {
				System.out.println(v.toString());
			}
			if (vehicles.size() == 0) {
				System.out.println("Garage is empty");
			}
		}
}
