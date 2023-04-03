package com.skilldistillary.jets.entities;

public class MarianaFruitBat extends Bat implements FruitBat {


	public MarianaFruitBat(String breed, double flightSpeed, double range, double lifeSpan) {
		super(breed, flightSpeed, range, lifeSpan);
	}

	
	
	@Override
	public void spitSeeds() {
		System.out.println("Marie Mariana is happily enjoying her fruit and it looks like shes filling up more spittoons");
	}

	
	
	
	public void batActivities() {
		System.out.println("The " + getBreed() + " is eating apples and spitting the seeds in a spittoon.");
		
	}


	@Override
	public String toString() {
		return  " Here we have one of our Fruit bats "+getBreed() + ", who flys up to " + getFlightSpeed() + " MPH" + ", can travel up to "
				+ getRange() + " miles in one flight " + ", lives for " + getLifeSpan() + " years\n";
	}



	
	

}
