package robkruzel;

import java.util.Random;

public class Die {

	private Integer value;
	
	public Die() {
		this.value = 0;
	}
	
	public Integer rollDie() {
		Random rand = new Random();
		this.value = rand.nextInt(6) + 1;
		return value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	
}
