public class Deck {
	private Card[] cards;
	private int cardsDealt;
	
	public Card makeClub(int value) {
		return new Card("Clubs", value);
	}
	
	public Card makeDiamond(int value) {
		return new Card("Diamonds", value);
	}
	
	public Card makeHeart(int value) {
		return new Card("Hearts", value);
	}
	
	public Card makeSpade(int value) {
		return new Card("Spades", value);
	}
	
	public Deck() {
		this.cards = new Card[52];
		this.cardsDealt = 0;
		int c = 0;
		for (int i = 2; i < 15; i++) {
			cards[c++] = makeClub(i);
			cards[c++] = makeHeart(i);
			cards[c++] = makeDiamond(i);
			cards[c++] = makeSpade(i);
		}
		shuffle();
	}
	public void shuffle() {
		int c = 0;
		Card[] newCards = new Card[52];
		boolean wasUsed = new boolean[52];
		for (int i = 0; i < 52; i++) {
			wasUsed[i] = false;
		}
		while (c < 52) {
			int r = (int) (52 * Math.random());
			
			if (wasUsed[r]) continue;
			
			wasUsed[r] = true;
			newCards[c++] = cards[r];
		}
		this.cards = newCards;
	}
	
	public Card deal() {
		return this.cards[this.cardsDealt++];
	}
}
