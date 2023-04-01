package com.skilldistillary.jets.entities;

public class MarianaFruitBat  extends Bats implements FruitBat{
	private int marianaFruitBatRange;
	
	
	@Override
	public void feedBat() {
		System.out.println("enjoying yummy fruit...."); 
		
	}
	
	

	public int getMarianaFruitBatRange() {
		return marianaFruitBatRange;
	}





	public void setMarianaFruitBatRange(int marianaFruitBatRange) {
		this.marianaFruitBatRange = marianaFruitBatRange;
	}



	@Override
	public String toString() {
		return "MarianaFruitBat [marianaFruitBatRange=" + marianaFruitBatRange + "]";
	}






	
	
	
}
