package javaMid2.collection.test.mytest;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> handCard = new ArrayList<>();
    private String name;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void drawPlayerCard(Deck deck)
    {
        for (int i = 0; i < 5; i++) {
            handCard.add(deck.getCard());
        }
    }
    public List<Card> getPlayerCard()
    {
        return handCard;
    }


}
