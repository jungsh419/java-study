package javaMid2.collection.test.mytest;

public class CardGameMain {
    public static void main(String[] args) {

        Deck deck = new Deck();
        // 카드생성
        deck.initCard();

        Player p1 = new Player("player1");
        Player p2 = new Player("player2");

        p1.drawPlayerCard(deck);
        p2.drawPlayerCard(deck);

        deck.getWinner(p1,p2);

    }
}
