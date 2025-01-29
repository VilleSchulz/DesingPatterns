import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    int Wins;
    int Loses;
    int index;
    private int value;
    Boolean stay = false;
    List<Card> hand;

    public Player(String name, int index) {
        this.name = name;
        this.index= index;
        this.Loses = 0;
        this.Wins = 0;

        hand = new ArrayList<>();

    }


    public List<Card> getCards() {
        return hand;

    }
    //add card to players hand
    public void takeCard(Card card) {
        hand.add(card);
        value += card.value;


    }


    public int getValue(){
        return value;


    }

    public void clearHand() {
        hand.clear();
        value = 0;
    }


}
