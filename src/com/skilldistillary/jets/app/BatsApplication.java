package com.skilldistillary.jets.app;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillary.jets.entities.BatCave;
import com.skilldistillary.jets.entities.FruitBat;
import com.skilldistillary.jets.entities.HBat;
import com.skilldistillary.jets.entities.HoaryBat;
import com.skilldistillary.jets.entities.MarianaFruitBat;
import com.skilldistillary.jets.entities.regularBat;
import com.skilldistillary.jets.entities.Bat;

public class BatsApplication {

	public static void main(String[] args)  {
		BatsApplication bc = new BatsApplication();
		bc.welcomeMessage();
		bc.run();

	}

	public void run()  {
		Scanner kb = new Scanner(System.in);

		BatCave bc = new BatCave();
		String fn = "Bats.txt";
		List<Bat> batInfo = bc.readFromFile(fn);
		bc.setColony(batInfo);

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
				System.out.println("Lets check up on our bat friends and see what eveyone is up to.");
				batActivities(batInfo);
				break;
			case 3:
				System.out.println("Lets race the bats and see whose fastest!");
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
				addBat(kb, batInfo);
				break;
			case 8:
				System.out.println("Take a bat home with you");
				removeBat(kb, batInfo);
				break;
			case 9:
				System.out.println("GoodBye");
				break loop;
			default:
				System.out.println("Invalid entry. Enter a number 1-4.");
				break;
			}

		}
		kb.close();
	}

	private void welcomeMessage() {
		System.out.println("welcome to the bat cave let me introduce you to some of our residents.");
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
		System.out.println("| 7. Want to add to our bat cave?     |");
		System.out.println("| 8. Need to take your bat back home? |");
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
		System.out.println("And the winner is: " + max.getBreed() + " at " + max.getFlightSpeed() + " Mph");

	}

	private void batFurthestFlight(List<Bat> batInfo) {
		Bat max = batInfo.get(0);
		for (Bat b : batInfo) {
			if (b.getRange() > max.getRange()) {
				max = b;
			}
		}
		System.out.println("And the bat with most stamina is: " + max.getBreed() + " flying " + max.getRange()
				+ " miles in a single trip.");
	}

	private void howIsHarry(List<Bat> batInfo) {
		for (Bat harry : batInfo) {
			if (harry instanceof HoaryBat) {
				((HoaryBat) harry).trimHair();
			}
		}

	}

	private void howIsMarie(List<Bat> batInfo) {
		for (Bat marie : batInfo) {
			if (marie instanceof FruitBat) {
				((FruitBat) marie).spitSeeds();
			}
		}
	}

	public void addBat(Scanner kb, List<Bat> batInfo) {
		int choice = 0;
		String breed = "";
		double flightSpeed = 0.0;
		double range = 0.0;
		double lifeSpan = 0.0;

		Bat b;
		try {
			System.out.println("Please enter type of bat by typing \n"+ "1: Fruit\n" + "2: Hoary\n" + "3: Bat");
			choice = kb.nextInt();
			kb.nextLine();
		
			System.out.println("Please enter breed of bat to add to bat cave");
			breed = kb.nextLine();
		
			System.out.println("How fast can this bat fly?");
			flightSpeed = kb.nextDouble();
		
			System.out.println("How far can your bat fly");
			range = kb.nextDouble();
		
			System.out.println("How long doe this litte critter live?");
			lifeSpan = kb.nextDouble();
		
		
		switch(choice) {
		case 1:
			b = new MarianaFruitBat(breed, flightSpeed, range, lifeSpan);
			batInfo.add(b);
			break;
		case 2:
		
			b = new HBat(breed, flightSpeed, range, lifeSpan);
			batInfo.add(b);
			break;
		case 3:
			b = new regularBat(breed, flightSpeed, range, lifeSpan);
			batInfo.add(b);
			break;
		default:
				System.out.println("Ivalid entry");
				break;
				
			}
		}catch(InputMismatchException e) {
			System.out.println("Invaid entry");
			System.out.println(e);
		}
	}

	public void removeBat(Scanner kb, List<Bat> batInfo) {

		try {
			System.out.println("Please select which bat you're taking home by select a number between 0 and "
					+ (batInfo.size() - 1));
			int byeByeBat = kb.nextInt();
			if (byeByeBat <= batInfo.size()) {
				batInfo.remove(byeByeBat);
			}

		} catch (InputMismatchException e) {
			System.out.println("Invaild input. Please enter numerical value onle.");
			System.out.println(e);
		}

	}
}
