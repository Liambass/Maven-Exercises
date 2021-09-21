package com.liambass.vehicles;

public class Motorcycle extends Vehicle {

	private int cc;
	private String make;
	private String colour;
	
	public Motorcycle(int numberOfWheels, int cc, String make, String colour) {
		super(numberOfWheels, "Motorcycle");
		this.cc = cc;
		this.make = make;
		this.colour = colour;
	}

	public int getCc() {
		return cc;
	}

	@Override
	public String toString() {
		return "Motorcycle [cc=" + cc + ", make=" + make + ", colour=" + colour + ", getId()=" + getId()
				+ ", getNumberOfWheels()=" + getNumberOfWheels() + ", getType()=" + getType() + "]";
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public double fixCost() {
		return (getNumberOfWheels() == 2)? cc * 5 : cc * 10;
	}
	
	
		
}
