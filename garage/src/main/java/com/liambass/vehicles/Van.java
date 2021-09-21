package com.liambass.vehicles;

public class Van extends Vehicle {
	
	private String make;
	private double maxLoad;
	private String wheelBase;
	
	public Van(int numberOfWheels, String make, double maxLoad, String wheelBase) {
		super(numberOfWheels, "Van");
		this.make = make;
		this.maxLoad = maxLoad;
		this.wheelBase = wheelBase;
	}

	@Override
	public String toString() {
		return "Van [make=" + make + ", maxLoad=" + maxLoad + ", wheelBase=" + wheelBase + ", getId()=" + getId()
				+ ", getNumberOfWheels()=" + getNumberOfWheels() + ", getType()=" + getType() + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}

	public String getWheelBase() {
		return wheelBase;
	}

	public void setWheelBase(String wheelBase) {
		this.wheelBase = wheelBase;
	}

	@Override
	public double fixCost() {
		return (((int) maxLoad) + 2 * 150);
	}
	
	
	
	
	
	

}
