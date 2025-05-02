package javaMid2.collection.test.test;

public class CardGameMain2 {
    public static void main(String[] args) {

       Deck2 deck = new Deck2();
       Player2 player1 = new Player2("플레이어1");
       Player2 player2 = new Player2("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawPlayerCard(deck);
            player2.drawPlayerCard(deck);
        }

        player1.showHand();
        player2.showHand();

        Player2 winner = getWinner(player1, player2);
        if(winner != null)
        {
            System.out.println(winner.getName() + " 승리");

        }
        else {
            System.out.println("무승부");
        }

    }

    private static Player2 getWinner(Player2 player1, Player2 player2)
    {
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1 > sum2) {
            return player1;
        }
        else if (sum1 == sum2) {
            return null;
        }
        else
        { return player2;
        }
    }

}
