package javabasic.access.ex;

public class ShoppingCart {

    private int count = 0;

    private Item[] carts = new Item[10];

    public void addItem(Item item)
    {
        if(count >=10)
        {
            System.out.println("물건은 10개 까지");
        }
        else
        {
            carts[count] = item;
            count++;
        }

    }
    public void displayItems()
    {
        int total = 0;
        System.out.println("장바구니 상품 출력");

        for(Item item : carts)
        {
            if(item == null)
            {
                System.out.println("비어있음");
                continue;
            }
            total += item.getTotal();
            System.out.println("상품명 : "+ item.getname() +"합계 : " + total );
        }
    }



}
