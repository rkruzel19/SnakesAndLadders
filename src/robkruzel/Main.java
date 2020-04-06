package robkruzel;


public class Main {

	public static void main(String[] args) {
		SnakesAndLadders game = new SnakesAndLadders();
		game.setPlayers(Display.welcome());
		game.startGame();
		while (game.winner == null) {
			game.takeTurn();
			System.out.println("*************************\n*******************************\n");
		}
//		game.takeTurn();
//		for (int i = 0; i < 10; i++) {
//			game.takeTurn();
//			System.out.println("\n\n\n");
//		}
//		System.out.println(game.players.get(0));
//		System.out.println(game.players.get(1));
//		System.out.println(game.dice.get(0).getValue());
//		System.out.println(game.specialTiles.get(16));
		
	}

}
