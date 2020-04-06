package robkruzel;
import	java.util.*;

public class SnakesAndLadders {
	
	HashMap<Integer, Integer> specialTiles = new HashMap<Integer, Integer>();
	ArrayList<Player> players = new ArrayList<>();
	Die die;
	Player currentRoller;
	Player winner = null;
	
	
	public SnakesAndLadders() {
		setSpecialTiles();
		this.die = new Die();
	}

	public void setPlayers(Integer numOfPlayers){
		for(int x = 1; x <= numOfPlayers; x++) {
			Player player = new Player(Display.getPlayerName(x));
			this.players.add(player);
		}
	}
	
	public void findFirstPlayer() {
		Random rand = new Random();
		this.currentRoller = players.get(rand.nextInt(players.size()));
		Display.currentRoller(currentRoller.getName()); 
	}
	
	public void startGame() {
		Display.readyToStart();
		findFirstPlayer();
	}
	
	public void takeTurn() {
		ArrayList<Integer> dice = rollDice();
		Integer sumOfRoll = dice.get(0) + dice.get(1);
		movePlayer(sumOfRoll);
		if (currentRoller.getCurrentTile() == 100) {
			winner = currentRoller;
			Display.winner(currentRoller.getName());
		} else if (rolledDoubles(dice.get(0), dice.get(1))) {
			takeTurn();
		} else {
			String currentName = currentRoller.getName();
			findNextRoller();
			Display.endOfTurn(currentName, currentRoller.getName());
		}
	}
	
	public void findNextRoller() {
		Integer currentIndex = players.indexOf(currentRoller);
		if (currentIndex == players.size() - 1) {
			currentRoller = players.get(0);
		} else {
			currentRoller = players.get(currentIndex + 1);
		}
	}
	
	public boolean rolledDoubles(Integer die1, Integer die2) {
		if (die1 == die2) {
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<Integer> rollDice() {
		ArrayList<Integer> dice = new ArrayList<Integer>();
		dice.add(die.rollDie());
		dice.add(die.rollDie());
		Display.rolling(currentRoller.getName(), currentRoller.getCurrentTile(), dice.get(0), dice.get(1));
		return dice;
	}
	
	public void movePlayer(Integer roll) {
		Integer previousTile = currentRoller.getCurrentTile();
		if (currentRoller.getCurrentTile() + roll > 100) {
			Display.over100(currentRoller.getName());
			currentRoller.setCurrentTile(100 - (currentRoller.getCurrentTile() + roll - 100));
			checkForSpecial(currentRoller.getCurrentTile());
			Display.moving(currentRoller.getName(), previousTile, currentRoller.getCurrentTile());
		} else {
			currentRoller.setCurrentTile(currentRoller.getCurrentTile() + roll);
			checkForSpecial(currentRoller.getCurrentTile());
			Display.moving(currentRoller.getName(), previousTile, currentRoller.getCurrentTile());
		}
	}
	
	public void checkForSpecial(Integer tile) {
		if (specialTiles.containsKey(tile)) {
			currentRoller.setCurrentTile(specialTiles.get(tile));
			Display.landedOnSpecial(currentRoller.getName(), tile, currentRoller.getCurrentTile());
		}
	}
	
	public void setSpecialTiles() {
		specialTiles.put(2, 38);
		specialTiles.put(7, 14);
		specialTiles.put(8, 31);
		specialTiles.put(15, 26);
		specialTiles.put(16, 6);
		specialTiles.put(21, 42);
		specialTiles.put(28, 84);
		specialTiles.put(36, 44);
		specialTiles.put(46, 25);
		specialTiles.put(49, 11);
		specialTiles.put(51, 67);
		specialTiles.put(62, 19);
		specialTiles.put(64, 60);
		specialTiles.put(71, 91);
		specialTiles.put(74, 53);
		specialTiles.put(78, 98);
		specialTiles.put(87, 94);
		specialTiles.put(89, 68);
		specialTiles.put(92, 88);
		specialTiles.put(95, 75);
		specialTiles.put(99, 80);
	}
}
