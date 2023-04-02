package com.skilldistillary.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillary.jets.entities.BatCave;
import com.skilldistillary.jets.entities.FruitBat;
import com.skilldistillary.jets.entities.HoaryBat;
import com.skilldistillary.jets.entities.Bat;

public class BatsApplication {

	public static void main(String[] args) {
		BatsApplication bc = new BatsApplication();
		bc.welcomeMessage();
		bc.run();

	}

	public void run() {
		Scanner kb = new Scanner(System.in);

		BatCave bc = new BatCave();
		String fn = "Bats.txt";
		List<Bat> batInfo = bc.readFromFile(fn);
		bc.setColony(batInfo);

//		System.out.println("Please enter class of bat(Fruit, Hoary, Bat");
//		String typeOfBat = kb.nextLine();
//		
//		System.out.println("Please enter breed of bat to add to bat cave");
//		String batBreed = kb.nextLine();
//		
//		System.out.println("How fast can this bat fly?");
//		double batSpeed = kb.nextDouble();
//		
//		System.out.println("How far can your bat fly");
//		double batFlyingRange = kb.nextDouble();
//		
//		System.out.println("How long doe this litte critter live?");
//		double batLifeSpan = kb.nextDouble();

		int userSelection = 0;
		loop: while (userSelection != 9) {
			optionMenu();
			System.out.println("Enter a number option.");
			userSelection = kb.nextInt();

			switch (userSelection) {
			case 1:
				System.out.println("Here's all the bats in our cave.");
				System.out.println(bc);
				break;
			case 2:
				System.out.println("Lets check up on our bat friends and she what eveyone is up to.");
				batActivities(batInfo);
				break;
			case 3:
				System.out.println("Lets race the bat and see whose fastest!");
				fastBat(batInfo);
				break;
			case 4:
				System.out.println("Lets see who has the most stamina?");
				batFurthestFlight(batInfo);
				break;
			case 5:
				System.out.println("Lets see if Marie needs more fruit");
				howIsMarie(batInfo);
				break;
			case 6:
				System.out.println("Let's take a closer look at Harry's new haircut.");
				howIsHarry(batInfo);
				break;
			case 7:
				System.out.println("Add a bat to our bat cave.");
				break;
			case 8:
				System.out.println("Take a bat home with you");
				break;
			case 9:
				System.out.println("GoodBye");
				break loop;
			default:
				System.out.println("Invalid entry. Enter a number 1-4.");
				break;
			}

		}

	}

	private void welcomeMessage() {
		System.out.println("welcome to the bat cave are you were to learn?");
	}

	private void optionMenu() {
		System.out.println("=======================================");
		System.out.println("|                                     |");
		System.out.println("| 1. List all bats.                   |");
		System.out.println("| 2. What are the bats up to?         |");
		System.out.println("| 3. Who's the fastest bat.           |");
		System.out.println("| 4. Which bat can fly the furthest.  |");
		System.out.println("| 5. Lets check on the fruit bat.     |");
		System.out.println("| 6. What the Harry up to?            |");
		System.out.println("| 7. Add a bat to the bat cave.       |");
		System.out.println("| 8. Take a bat out of the bat cave.  |");
		System.out.println("| 9. Quit.                            |");
		System.out.println("|                                     |");
		System.out.println("=======================================");
	}

	private void batActivities(List<Bat> batInfo) {
		for (Bat b : batInfo) {
			b.batActivities();
		}
	}

	private void fastBat(List<Bat> batInfo) {
		Bat max = batInfo.get(0);
		for (Bat b : batInfo) {
			if (b.getFlightSpeed() > max.getFlightSpeed()) {
				max = b;
			}
		}
		System.out.println("And the winner is: " + max.getBreed() + " at " + max.getFlightSpeed() + "Mph");

	}

	private void batFurthestFlight(List<Bat> batInfo) {
		Bat max = batInfo.get(0);
		for (Bat b : batInfo) {
			if (b.getRange() > max.getRange()) {
				max = b;
			}
		}
		System.out.println("And the bat with most stamina is: " + max.getBreed() + " with " + max.getRange()
				+ " miles in a single trip.");
	}

	private void howIsHarry(List<Bat> batInfo) {
		for (Bat harry : batInfo) {
			if (harry instanceof HoaryBat) {
				((HoaryBat)harry).trimHair();
			}
		}

	}

	private void howIsMarie(List<Bat> batInfo) {
		for (Bat marie : batInfo) {
			if (marie instanceof FruitBat) {
				((FruitBat)marie).spitSeeds();
			}
		}
	}

	
}
