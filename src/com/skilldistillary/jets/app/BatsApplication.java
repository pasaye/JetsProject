package com.skilldistillary.jets.app;

import java.util.Scanner;

import com.skilldistillary.jets.entities.BatCave;
import com.skilldistillary.jets.entities.Bats;

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
		bc.readFromFile(fn);
		
		System.out.println("Please enter breed of bat to add to bat cave");
		String batBreed = kb.nextLine();
		
		System.out.println("How fast can this bat fly?");
		double batSpeed = kb.nextDouble();
		
		System.out.println("How far can your bat fly");
		int batFlyingRange = kb.nextInt();
		
		System.out.println("How long doe this litte critter live?");
		long batLifeSpan = kb.nextLong();
		
		
		
		
		int userSelection = 0;
		loop: while (userSelection != 9) {
			optionMenu();
			System.out.println("Enter a number option.");
			userSelection = kb.nextInt();

			switch (userSelection) {
			case 1:
				System.out.println("Here's all the bats in our cave.");
				break;
			case 2:
				System.out.println("The bats are greatful for the fresh air!");
				break;
			case 3:
				System.out.println("Take a closer look at our colony.");
				break;
			case 4:
				System.out.println("Wonder which bat can fly the furthest?");
				break;
			case 5:
				System.out.println("Feed the fruit bat.");
				break;
			case 6:
				System.out.println("Pet the Hoary bat.");
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
		System.out.println("| 2. Fly all bats.                    |");
		System.out.println("| 3. View all bats.                   |");
		System.out.println("| 4. Which bat can fly the furthest.  |");
		System.out.println("| 5. Feed the fruit bat.              |");
		System.out.println("| 6. Pet the Hoary bat.               |");
		System.out.println("| 7. Add a bat to the bat cave.       |");
		System.out.println("| 8. Take a bat out of the bat cave.  |");
		System.out.println("| 9. Quit.                            |");
		System.out.println("|                                     |");
		System.out.println("=======================================");
	}
	
	
}
