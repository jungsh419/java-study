package javaMid2.collection.list.test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items = new ArrayList<>();
    private int sum;

    public void addItem(Item item)
    {
        items.add(item);
    }

    public void displayItems()
    {
        System.out.println("장바구니 상품 출력");

        for(Item item: items)
        {
            sum += item.getTotalPrice();
            System.out.println("상품명: " + item.getName()+ ", 합계: "+item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
