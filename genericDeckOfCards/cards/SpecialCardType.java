package genericDeckOfCards.cards;

public enum SpecialCardType {

	ACE(1), JACK(11), QUEEN(12), KING(13);
	
	private int value;
	
	private SpecialCardType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
