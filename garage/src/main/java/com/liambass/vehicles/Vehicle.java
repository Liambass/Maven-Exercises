package com.liambass.vehicles;

public abstract class Vehicle {

	private int id;
	private int numberOfWheels;
	private String type;
	public static int inc = 1;
	
	
	public Vehicle(int numberOfWheels, String type) {
		super();
		this.id = inc;
		this.numberOfWheels = numberOfWheels;
		this.type = type;
		inc++;
	}


	public int getId() {
		return id;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}


	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	public abstract double fixCost();


	public void bills() {
		System.out.println("The " + getType() + " with ID: " + getId() + " will cost £" + fixCost() + " to repair");
	}


	@Override
	public abstract String toString() ;


	
}
