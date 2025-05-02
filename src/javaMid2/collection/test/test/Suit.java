package javaMid2.collection.test.test;

public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    DIA("♦"),
    CLOV("♣"),
    ;

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
