package com.skilldistillary.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BatCave {
	private List<Bat> colony; 

	public BatCave() {
		// population bats from file
		colony = new ArrayList<>();

	}

	public List<Bat> readFromFile(String fn) {
		List<Bat> batsInfo = new ArrayList<>();
		
		
		try ( BufferedReader bufIn = new BufferedReader(new FileReader(fn)) ) {
			  String batLine;
			  while ((batLine = bufIn.readLine()) != null) {
				String[] batDetails = batLine.split(",");
				
				String typeOfBat = batDetails[0];
				String breed = batDetails[1];
				double flightSpeed = Double.parseDouble(batDetails[2]);
				double range = Integer.parseInt(batDetails[3]);
				double lifeSpan = Long.parseLong(batDetails[4]);
				
				Bat b;
				
				if(typeOfBat.equals("Fruit")) {
					b = new MarianaFruitBat(breed, flightSpeed, range, lifeSpan);
					
				}else if(typeOfBat.equals("Hoary")) {
					b = new HBat(breed, flightSpeed, range,lifeSpan);
					
				}else {
					b = new regularBat(breed, flightSpeed, range, lifeSpan);
				}
				
				batsInfo.add(b);	 	
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		//and add that jet type to jet list
		return batsInfo;
		
	}

	public List<Bat> getColony() {
		return colony;
	}

	public void setColony(List<Bat> colony) {
		this.colony = colony;
	}

	
	
	@Override
	public String toString() {
		
		return "The bat in the BatCave are " + colony +"\n";
	}
	
	

}
