import java.util.ArrayList;

public class Deck {
	public static final int NUMCARDS = 52;
	private ArrayList<Card> deckOfCards;

    /**
     * Constructs the deck, assigning all the suits the 13 ranks.
     */
	public Deck() {
		deckOfCards = new ArrayList<Card>();
		int i = 0;
        String suitName = "";
		for(int suit = 1; suit <= 4; suit++) {
			for(int rank = 1; rank <= 13; rank++) {
				deckOfCards.add(new Card(suit, rank));
			}
		}
	}

    /**
     *
     * @return the deck of cards.
     */
    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }

    /**
     * Uses deckOfCards to create a new ArrayList of it, but shuffled.
     * @return a shuffled deck.
     */
	public ArrayList<Card> shuffle() {
        ArrayList<Card> newDeck = new ArrayList<>();
        while(deckOfCards.size() > 0){
            int i =(int) Math.round(Math.random() * (deckOfCards.size() - 1));
            newDeck.add(deckOfCards.get(i));
            deckOfCards.remove(i);
        }
        deckOfCards = newDeck;
        return deckOfCards;
	}

    public String toString(){
        return deckOfCards.toString();
    }
}