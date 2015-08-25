import java.util.ArrayList;

/**
 * Created by mphannon on 8/25/15.
 */
public interface Hand {

    public ArrayList<Card> deal();
    public void deal(int turn);

}
