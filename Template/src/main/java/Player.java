import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    int wins;
    int loses;
    int index;
    private int value;
    private Boolean stay = false;
    List<Card> hand;

    public Player(String name, int index) {
        this.name = name;
        this.index= index;
        this.loses = 0;
        this.wins = 0;

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
        stay = false;
    }

        public boolean setStay() {
            System.out.println(name + " stays at: "+ value);
            stay = true;
            return true;
        }

        public boolean getStay() {
            return stay;
        }


}
