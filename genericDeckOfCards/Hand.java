package genericDeckOfCards;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import genericDeckOfCards.cards.Card;

public class Hand {

	private List<Card> cards = null;
	
	public Hand(List<Card> cards) {
		// TODO Auto-generated constructor stub
		this.cards = cards;
	}
	
	public int score() {
		AtomicInteger i = new AtomicInteger();
		
		cards.forEach(obj -> i.addAndGet(obj.getFaceValue()));
		return i.get();
		
		
	}
	
	public void addCard(Card c) {
		cards.add(c);
	}
}


