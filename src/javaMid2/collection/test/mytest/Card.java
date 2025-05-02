package javaMid2.collection.test.mytest;

public class Card {
    private int rank;
    private String shape;

    public Card(int rank, String shape) {
        this.rank = rank;
        this.shape = shape;
    }

    public int getRank() {
        return rank;
    }

    public String getShape() {
        return shape;
    }


    @Override
    public String toString() {
        return rank + "(" + shape + ")";
    }

}
