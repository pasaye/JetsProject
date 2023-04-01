package com.skilldistillary.jets.entities;

import java.util.Objects;

public abstract class Bats {
	private String breed;
	private double flightSpeed;
	private int range;
	private long lifeSpan;
	
	
	public Bats() {};
	 
	public Bats(String breed, double flightSpeed, int range, long lifeSpan) {
		super();
		this.breed = breed;
		this.flightSpeed = flightSpeed;
		this.range = range;
		this.lifeSpan = lifeSpan;
	}

	public void fly() {
		//fly jets
	}
	
	public double getSpeed (double flightSpeed) {
		this.flightSpeed = flightSpeed;
		
		return flightSpeed;
	}
	
	
	
	public String getModel() {
		return breed;
	}

	public void setModel(String model) {
		this.breed = model;
	}

	public double getSpeed() {
		return flightSpeed;
	}

	public void setSpeed(double speed) {
		this.flightSpeed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return lifeSpan;
	}

	public void setPrice(long lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(breed, flightSpeed, lifeSpan, range);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bats other = (Bats) obj;
		return Objects.equals(breed, other.breed)
				&& Double.doubleToLongBits(flightSpeed) == Double.doubleToLongBits(other.flightSpeed)
				&& lifeSpan == other.lifeSpan && range == other.range;
	}

	@Override
	public String toString() {
		return "Jet [model=" + breed + ", speed=" + flightSpeed + ", range=" + range + ", price=" + lifeSpan + "]";
	}
	
	
	

}