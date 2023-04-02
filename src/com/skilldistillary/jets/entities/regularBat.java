package com.skilldistillary.jets.entities;

public class regularBat extends Bat {

	public regularBat() {
		super();

	}

	public regularBat(String breed, double flightSpeed, double range, double lifeSpan) {
		super(breed, flightSpeed, range, lifeSpan);
		
		
	}

	


	@Override
	public void batActivities() {
		System.out.println("The " + getBreed() + " is a boring old bat who spends most of the time sleeping");
		
	}

	@Override
	public String toString() {
		return "This regular old bat is a " + getBreed() + ", which flys as fast as " + getFlightSpeed() + " MPH" +", and is known to fly as far as "
				+ getRange() + ", and will life as long as " + getLifeSpan() + " years \n";
	}
	
	
	
	
	
}
