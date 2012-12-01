package euler;

public class Card implements Comparable{
	public static final int CLUBS = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;

	public int suit;
	public int rank;

	public Card() {
		rank = 0;
		suit = 0;
	}
	
	public Card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}

	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	
	public void setSuit(int suit){
		this.suit = suit;
	}
	
	public void setRank(int rank){
		this.rank = rank;
	}
	
	public int compareTo(Object other){
		return - ((Integer) rank).compareTo((Integer)((Card) other).rank);
	}
	
}
