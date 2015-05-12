import java.util.ArrayList;
import java.util.Scanner;

/**
 * BlackJack is the class that runs the game "Black Jack"
 * Created by Michael Hannon on 5/9/15.
 */

//This should be under a gamemode class or interface
public class BlackJack {
    private ArrayList<Card> deck;
    ArrayList<Card> hand;
    private Card shownCard;
    private Scanner input;
    private int i;
    private int value;
	public BlackJack(ArrayList<Card> deck) {
		this.deck = deck;
	}

    public int round(int i) {
        String answer = "hit";
        i += 0;
        hand = new ArrayList<Card>();
        hand.add(deck.get(i));
        shownCard = deck.get(i);
        i++;
        while(answer.equals("hit")) {
            answer = "";
            hand.add(deck.get(i));
            input = new Scanner(System.in);
            System.out.println("Your hand is: ");
            for(Card card : hand) {
                System.out.println(card);
            }
            //  System.out.println("Your visible card are: " + hand.toString());
            System.out.println("Hit or stand? ");
            answer = input.next().toLowerCase();
            if (answer.substring(0, 1).equals("h")) {
                i++;
            } else {
                break;
            }
        }
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
                value += temp;
            }

        return value;
    }

}
