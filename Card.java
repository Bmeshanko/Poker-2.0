public class Card {
	private String suit;
	private int value; // 2 = 2, 14 = Ace
	
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString() {
		return this.value + " of " + this.suit;
	}
}
