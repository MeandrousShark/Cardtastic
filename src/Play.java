import java.util.ArrayList;

/**
 * Created by Michael Hannon on 05/11/15.
 */
public class Play {

    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> playingDeck = deck.shuffle();
        BlackJack bj = new BlackJack(playingDeck);
        int value = bj.round();
        System.out.println("Total = " + value);
    }
}
