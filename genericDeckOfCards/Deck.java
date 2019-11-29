package genericDeckOfCards;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import genericDeckOfCards.cards.Card;

public class Deck {

	private List<Card> cards = null;
	
	private int index ;
	
	public Deck() {
		cards = new ArrayList<Card>();
		index = 0;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
		shuffle();
	}
	
	public void shuffle() {
		Set<Card> cards = new HashSet<Card>(this.cards);
		this.cards.clear();
		this.cards.addAll(cards);
	}
	
	public Card removeCard(Card c) {
		// implementations
		index--;
		return null;
	}
	
	public int remainingCards() {
		return this.cards.size() - index;
	}
	
	
	
	public void addCard( Card c ) {
		index++;
		this.cards.add(c);
	}
	
	
}
