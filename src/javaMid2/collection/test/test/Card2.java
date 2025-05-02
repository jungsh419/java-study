package javaMid2.collection.test.test;

public class Card2 implements Comparable<Card2>{
    private final int rank;
    private final Suit suit;

    public Card2(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card2 o) {
        // 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if (this.rank != o.rank) {
            return Integer.compare(this.rank, o.rank);
        }
        else {
            return this.suit.compareTo(o.suit);
        }
    }
    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
