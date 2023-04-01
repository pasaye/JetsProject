package com.skilldistillary.jets.entities;

public class HBat extends Bats implements HoaryBat {
	
	
	private int hoaryBatsRange;

	@Override
	public void petBat() {
		System.out.println("Makes wierd noises....");
		
	}

	public int getHoaryBatsRange() {
		return hoaryBatsRange;
	}

	public void setHoaryBatsRange(int hoaryBatsRange) {
		this.hoaryBatsRange = hoaryBatsRange;
	}

	@Override
	public String toString() {
		return "HBat [hoaryBatsRange=" + hoaryBatsRange + "]";
	}

	
	
}
