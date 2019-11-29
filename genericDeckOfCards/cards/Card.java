package genericDeckOfCards.cards;

public abstract class Card {

	private int faceValue;
	private Suit suit;
	private boolean isAvail;
	
	public Card(int faceValue, Suit suit) {
		this.faceValue = faceValue;
		this.suit = suit;
		this.setAvail(true);
	}
	
	
	public boolean isBiggerCard(Card card) {
		
		if(this.faceValue == 1)
			return true;
		
		if(card.faceValue == 1)
			return false;
		
		return (this.faceValue >= card.faceValue) ? true : false;
		
	}


	public int getFaceValue() {
		return faceValue;
	}


	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}


	public Suit getSuit() {
		return suit;
	}


	public void setSuit(Suit suit) {
		this.suit = suit;
	}


	public boolean isAvail() {
		return isAvail;
	}


	public void setAvail(boolean isAvail) {
		this.isAvail = isAvail;
	}
	
	
}
