package PlayersOnTeam;

import java.util.Scanner;

//PlayersOnTeam code for Venus HO
//CIS 084
//Java Programming
//Feb 21 - Feb 26 2023 Lab Assignment

//I also included a switch, case, and break code at the end
//It's something I learned in my JavaScript course
//And wanted to see if I can use it here as well


public class PlayersOnTeam {

	static Scanner userInput;

	public static void main(String[] args) {
		int teamSize;
		int playersOnTeam;
		int morePlayersNeeded;
		int extraPlayers;

		userInput = new Scanner(System.in);

		teamSize = selectTeamSize();
		System.out.println("There should be" + " " + teamSize + " players");

		System.out.print("How many players are currently on the team? ");
		playersOnTeam = userInput.nextInt();

		if (playersOnTeam < teamSize) { // if & if else
			System.out.println("There are not enough players!");
			morePlayersNeeded = teamSize - playersOnTeam;
			System.out.println("Please add " + morePlayersNeeded + " more players!");
		}

		else if (playersOnTeam > teamSize) {
			System.out.println("There are too many players on board!");
			extraPlayers = playersOnTeam - teamSize;
			System.out.println("Please remove " + extraPlayers + " players!");
		} else {
			System.out.println("You have the correct number of players");
		}

	}

//	static int selectTeamSize() { // method using suggested do-while/if/else 
//		int teamSelection;
//		int teamSize;
//
//		do { // do-while loop makes sure that the code is executed at least once
//
//			System.out.println("Select a professional sport from the list below: ");
//			System.out.println("1 : MLB Baseball");
//			System.out.println("2 : NFL Football");
//			System.out.println("3 : NBA Basketball");
//			System.out.println("4 : NHL Hockey");
//			System.out.println("5 : PPL Lacrosse");
//			System.out.println("Select (1-5): ");
//
//			teamSelection = userInput.nextInt();
//
//			if (teamSelection == 1) {
//				teamSize = 25;
//			} else if (teamSelection == 2) {
//				teamSize = 53;
//			} else if (teamSelection == 3) {
//				teamSize = 13;
//			} else if (teamSelection == 4) {
//				teamSize = 23;
//			} else if (teamSelection == 5) {
//				teamSize = 12;
//			} else {
//				System.out.println("The number you have enter is invalid - please try again!");
//				teamSize = 0;
//			}
//
//		} while (teamSize == 0); // while loop: only executes until condition is met
//		return teamSize;
//	}

	static int selectTeamSize() { //method using do-while, switch cases methods
		int teamSelection;
		int teamSize = 0;

		do {
			System.out.println("Select a professional sport from the list below: ");
			System.out.println("1 : NFL Football");
			System.out.println("2 : NBA Basketball");
			System.out.println("3 : MLB Baseball");
			System.out.println("4 : NHL Hockey");
			System.out.println("5 : PPL Lacrosse");
			System.out.println("Select (1-5): ");

			teamSelection = userInput.nextInt();

			switch (teamSelection) {
			case 1:
				teamSize = 53;
				break;
			case 2:
				teamSize = 13;
				break;
			case 3:
				teamSize = 25;
				break;
			case 4:
				teamSize = 23;
				break;
			case 5:
				teamSize = 12;
				break;
			default:
				System.out.println("Invalid selection - try again!");
				break;
			}

		} while (teamSize == 0);

		return teamSize;
	}

}

//Git: Innominate-Majesty 