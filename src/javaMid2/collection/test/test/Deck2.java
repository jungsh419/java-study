package javaMid2.collection.test.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck2 {
    private List<Card2> cards = new ArrayList<>();
    public Deck2() {
        initCard();
        shuffle();
    }
    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card2(i, suit));
            }
        }
    }
    private void shuffle() {
        Collections.shuffle(cards);
    }
    public Card2 drawCard() {
        return cards.remove(0);
    }
}

