package com.skilldistillary.jets.entities;

public class HBat extends Bat implements HoaryBat {
	
	


	@Override
	public void trimHair() {
		System.out.println("Oh no! Harry's hair grew back to fast and he's back at the barber.");
	}

	public void batActivities() {
		System.out.println("Harry the " + getBreed() + " is checkin himself out after his fresh new haircut.");
		
	}

	public HBat(String breed, double flightSpeed, double range, double lifeSpan) {
		super(breed, flightSpeed, range, lifeSpan);
		
	}

	@Override
	public String toString() {
		return "Here we have one of our Hoary bats " + getBreed() + ", they can fly up to " + getFlightSpeed() + " MPH" + "they can fly as far as "
				+ getRange() + " Miles " +",and they can live for " + getLifeSpan() + " years.\n";
	}

	
	
}
