package euler;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	public static final int HIGH = 1;
	public static final int PAIR = 2;
	public static final int TWOPAIR = 3;
	public static final int THREEOFAKIND = 4;
	public static final int STRAIGHT = 5;
	public static final int FLUSH = 6;
	public static final int FULLHOUSE = 7;
	public static final int FOUROFAKIND = 8;
	public static final int STRAIGHTFLUSH = 9;

	ArrayList<Card> cards;
	ArrayList<Card> kickers;
	public int result;

	public Hand(Card card1, Card card2, Card card3, Card card4, Card card5) {
		cards = new ArrayList<Card>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);
		Collections.sort(cards);
		kickers = new ArrayList<Card>();
	}

	public boolean isStraight() {
		for (int i = 0; i < 4; i++) {
			if (cards.get(i).rank - 1 != cards.get(i + 1).rank)
				return false;
		}
		return true;

	}

	public boolean isFlush() {
		for (int i = 0; i < 4; i++) {
			if (cards.get(i).suit != cards.get(i + 1).suit)
				return false;
		}
		return true;
	}
	
	/*public boolean isFourOfAKind(){
		
	}*/

	public boolean isStraightFlush() {
		return isFlush() && isStraight();
	}

	public static void main(String[] args) {
		Card c1 = new Card(3, 2);
		Card c2 = new Card(6, 2);
		Card c3 = new Card(1, 2);
		Card c4 = new Card(4, 2);
		Card c5 = new Card(2, 2);
		Hand h = new Hand(c1, c2, c3, c4, c5);
		System.out.println(h.isFlush());
	}

}
