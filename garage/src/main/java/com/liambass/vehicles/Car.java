package com.liambass.vehicles;

public class Car extends Vehicle {

	private String make;
	private String colour;
	private int doors;
	
	
	public Car(int numberOfWheels, String make, String colour, int doors) {
		super(numberOfWheels, "Car");
		this.make = make;
		this.colour = colour;
		this.doors = doors;
	}


	public String getBrand() {
		return make;
	}


	public void setBrand(String make) {
		this.make = make;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getDoors() {
		return doors;
	}


	public void setDoors(int doors) {
		this.doors = doors;
	}


	@Override
	public double fixCost() {
		return getNumberOfWheels() * doors * 100;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", colour=" + colour + ", doors=" + doors + ", getId()=" + getId()
				+ ", getNumberOfWheels()=" + getNumberOfWheels() + ", getType()=" + getType() + "]";
	}






}
