

/**
 * BlackJack is the class that runs the game "Black Jack"
 * @author Michael Hannon
 * @version Not-Even-Alpha 1
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//This should be under a gamemode class or interface
public class BlackJack implements Hand {
    private ArrayList<Card> deck;
    //Holds the players hands (aw :D)
    private ArrayList<ArrayList<Card>> players;
    private Card shownCard;
    private int playerCount;
    private Scanner input;
    private int value;

    /**
     * Constructs the BlackJack game by initializing the HashMap and instantiating the values.
     * @param deck the ArrayList of cards.
     * @param playNum The amount of players.
     */
    public BlackJack(ArrayList<Card> deck, int playNum) {
        this.deck = deck;
        playerCount = playNum;
        players = new ArrayList<>(playNum);
    }

    /**
     * Deals out a BlackJack Hand.
     * @return the Hand.
     */
    public ArrayList<Card> deal() {
        ArrayList<Card> hand = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            hand.add(deck.get(i));
            deck.remove(i);
        }
        return hand;
    }

    /**
     * Deals a single card to the current player.
     * @param turn The player who is receiving the card.
     */
    public void deal(int turn) {
        ArrayList<Card> temp = players.get(turn);
        temp.add(deck.get(0));
        deck.remove(0);
        players.set(turn, temp);
    }


    /**
     * Sets up the players hands, and deals them their cards.
     */
    public void setup() {
        for (int j = 0; j < playerCount; j++) {
            players.add(j, deal());
        }
    }

    //TODO Cycle between players
    //TODO If one player stands, allow other player to continue to hit
    //TODO Decompose this decomposable method.
    //TODO Implement the array of values for the scores of each player.
    /**
     * Runs a round of BlackJack.
     * @return The value of the hands.
     */

    public int[] round() {
        int[] values = new int[playerCount];
        String answer = "hit";
        int i = 0;
        int playerTurn = 0;

        GameLoop:
        do {
            answer = "";
            input = new Scanner(System.in);
            System.out.println("Your hand is: ");
            //TODO hand needs to change to use the ArrayList

//            for (int j = 0; j < playerCount; j++) {
//                for (int k = 0; k < players.get(j).size(); k++) {
//
//                }
//                System.out.println(card);
//            }

            while(true) {
                System.out.println("Hit or stand? ");
                answer = input.next().toLowerCase();
                if (answer.substring(0, 1).equals("hit")) {
                    i++;
                    break;
                } else if (answer.equals("stand")) {
                    break GameLoop;
                } else {
                    System.out.println();
                }
            }
        } while (answer.equals("hit"));

        //TODO Implement the array here
        //TODO Possibly make this it's own method
        for (int add = 0; add <= i; add++) {
            Card card = deck.get(add);
            int temp = card.getRank();
            if(temp == 1) {
                System.out.println("Do you want your ace to be one or eleven?");
                temp = input.nextInt();
            }
            if(temp > 9) {
                temp = 10;
            }
            values[playerTurn] += temp;
        }
        return values;
    }

    public int results() {

        return value;
    }

}
