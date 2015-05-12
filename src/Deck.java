import java.util.ArrayList;
public class Deck {
	public static final int NUMCARDS = 52;
	private ArrayList<Card> deckOfCards;
    private ArrayList<Card> shuffledDeck;

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

    public ArrayList<Card> getShuffledDeck() {
        return shuffledDeck;
    }

    /**
     * Uses deckOfCards to create a new ArrayList of it, but shuffled.
     * @return a shuffled deck.
     */
	public ArrayList<Card> shuffle() {
        ArrayList<Card> workingDeck = deckOfCards;
		shuffledDeck = new ArrayList<Card>();
		int random;
        int deckSize = workingDeck.size();
        for(int i = 0; i < deckSize; i++) {
			random = (int) (Math.random() * (NUMCARDS - i));
			shuffledDeck.add(workingDeck.get(random));
            workingDeck.remove(random);
		}
        return shuffledDeck;
	}
}