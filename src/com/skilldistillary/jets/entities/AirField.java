package com.skilldistillary.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet = new ArrayList<>();
	
	public AirField() {
		//populate fleet from file.
	}
	
	
	public List<Jet> readFromFile(String fn) {
		List<Jet> jets = new ArrayList<>();
		
		//read in the various jet from file
		try ( BufferedReader bufIn = new BufferedReader(new FileReader(fn)) ) {
			  String ajet;
			  while ((ajet = bufIn.readLine()) != null) {
				  //as you read in a create new up  a jet
				String[] jetDetails = ajet.split(",");
				//create the jet based on jet details
				//if the jetdetails[0] happens to be a dcv then creat a dvcjet.
				//else the jetdetails[0] happens to be a fighterthen creat a figther.
				
				
				//and add that jet to my jets
				
			    
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		//and add that jet type to jet list
		
		return jets;
		
	}

}
