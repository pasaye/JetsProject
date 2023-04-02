package com.skilldistillary.jets.entities;

import java.util.Objects;

public abstract class Bat {
	private String breed;
	private double flightSpeed;
	private double range;
	private double lifeSpan;

	public Bat() {
		
	};

	public Bat(String breed, double flightSpeed, double range, double lifeSpan) {
		super();
		this.breed = breed;
		this.flightSpeed = flightSpeed;
		this.range = range;
		this.lifeSpan = lifeSpan;
	}

	public  void batActivities() {} 
	public void spitSeeds() {}
	public void trimHair() {}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getFlightSpeed() {
		return flightSpeed;
	}

	public void setFlightSpeed(double flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(double lifeSpan) {
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
		Bat other = (Bat) obj;
		return Objects.equals(breed, other.breed)
				&& Double.doubleToLongBits(flightSpeed) == Double.doubleToLongBits(other.flightSpeed)
				&& Double.doubleToLongBits(lifeSpan) == Double.doubleToLongBits(other.lifeSpan)
				&& Double.doubleToLongBits(range) == Double.doubleToLongBits(other.range);
	}

	@Override
	public String toString() {
		String list = "Bat [breed=" + breed + ", flightSpeed=" + flightSpeed + ", range=" + range + ", lifeSpan=" + lifeSpan
				+ "]";
		
		return list;
	}

}