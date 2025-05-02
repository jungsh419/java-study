package javaMid2.collection.test.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }

    public void initCard()
    {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {

                switch(j)
                {
                    case 1-> cards.add(new Card(i,"\u2660"));
                    case 2-> cards.add(new Card(i,"\u2665"));
                    case 3-> cards.add(new Card(i,"\u2666"));
                    case 4-> cards.add(new Card(i,"\u2663"));
                }
            }
        }
        Collections.shuffle(cards);
    }

    public Card getCard()
    {

       Card getCard = cards.get(0);
       cards.remove(getCard);
       return getCard;
    }

    public void getWinner(Player p1, Player p2)
    {
        List<Integer> p1List= new ArrayList<>();
        List<Integer> p2List= new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < 5; i++) {

            p1List.add(p1.getPlayerCard().get(i).getRank());
            p2List.add(p2.getPlayerCard().get(i).getRank());

            sum1 += p1.getPlayerCard().get(i).getRank();
            sum2 += p2.getPlayerCard().get(i).getRank();
        }

        System.out.println(p1.getName() + "의 카드: " + p1.getPlayerCard()+ ", 합계: "+sum1);
        System.out.println(p2.getName()+ "의 카드: " + p2.getPlayerCard()+ ", 합계: "+sum2);
        if(sum1>sum2)
        {
            System.out.println("승자: "+p1.getName());
        }
        else if(sum1==sum2)
        {
            System.out.println("무승부");
        }
        else
        {
            System.out.println("승자: "+ p2.getName());
        }


    }


}
