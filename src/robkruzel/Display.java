package robkruzel;

public class Display {
	
	public static Integer welcome() {
		return Console.getIntegerInput("***Welcome to Snakes and Ladders***\nHow many players will there be?");
	}
	
	public static String getPlayerName(Integer number) {
		return Console.getStringInput("What is the name of player" + number + "?");
	}
	
	public static void readyToStart() {
		System.out.println("Everything's set up, let's begin!!!\n--------------------------------");
	}
	
	public static void currentRoller(String name) {
		System.out.println("It is " + name + "'s turn to roll.");
	}
	
	public static void rolling(String name, Integer currentTile, Integer die1, Integer die2) {
		Integer sum = die1 + die2;
		System.out.println(name + " is at tile " + currentTile + " rolled a " + die1 + " and a " + die2 + " for " + sum + " total.");
	}
	
	public static void moving(String name, Integer previousTile, Integer newTile) {
		System.out.println("\n" + name + " started at tile " + previousTile + " and is now at tile " + newTile);
	}
	
	public static void takeInput() {
		Console.getStringInput("Continue?");
	}
	
	public static void endOfTurn(String currentRoller, String nextRoller) {
		System.out.println(currentRoller + "'s turn is over. Next up is " + nextRoller);
	}
	
	public static void winner(String currentRoller) {
		System.out.println("Congradulations " + currentRoller + ", YOU WIN!!!");
	}
	
	public static void over100(String currentRoller) {
		System.out.println("Sorry " + currentRoller + ", you did land exactly on 100 :`(\nTime to bounce back");
	}
	
	public static void landedOnSpecial(String currentRoller, Integer startTile, Integer endTile) {
		System.out.println(currentRoller + " landed on a specail tile and moved from " + startTile + " to " + endTile);
	}
	
	public static void finalStandings(String winner, String second, String third, String fourth) {
		
	}
	
}
