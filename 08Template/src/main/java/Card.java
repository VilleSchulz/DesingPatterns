import java.util.List;

public class Card {
    public final Rank rank;
    public final Suit suit;
    public int value;


    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        value = rank.getValue();

    }


    @Override
    public String toString() {
        return
                "************************\n" +
                        this.rank + " of " + this.suit + " " + "(" + value + ")"  +
                        "\n************************"

                ;
    }

}



















