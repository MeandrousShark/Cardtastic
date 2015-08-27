import java.util.ArrayList;

/**
 * Created by Michael Hannon on 05/11/15.
 */
public class Play {

    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> playingDeck = deck.shuffle();
        //TODO Implement how many players want to play
        int playerCount = 1;
        BlackJack bj = new BlackJack(playingDeck, playerCount);
        int value = bj.results();
        System.out.println("Total = " + value);
    }
}
