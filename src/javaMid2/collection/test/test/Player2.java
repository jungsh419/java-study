package javaMid2.collection.test.test;

import java.util.ArrayList;
import java.util.List;

public class Player2 {
    private List<Card2> handCard;
    private String name;

    public Player2(String name)
    {
        this.name = name;
        this.handCard = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void drawPlayerCard(Deck2 deck)
    {
            handCard.add(deck.drawCard());
    }
    public int rankSum() {
        int value = 0;
        for (Card2 card : handCard) {
            value += card.getRank();
        }
        return value;
    }
    public void showHand() {
        handCard.sort(null);
        System.out.println(name + "의 카드: " + handCard + ", 합계: " + rankSum());
    }


}
