package robkruzel;

public class Player {
	String name;
	Integer currentTile;
	
	public Player(String name) {
		super();
		this.name = name;
		this.currentTile = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCurrentTile() {
		return currentTile;
	}

	public void setCurrentTile(Integer currentTile) {
		this.currentTile = currentTile;
	}

	@Override
	public String toString() {
		return "Player name=" + name + ", currentTile=" + currentTile + ".";
	}
	
	
}
