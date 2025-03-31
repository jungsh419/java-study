package javabasic.Class2;

public class ProductOrderMain2 {
    public static void main(String[] args)
    {
        ProductOrder2[] orders = new ProductOrder2[3];

        orders[0] = createOrder("김치", 5000, 3);
        orders[1] = createOrder("두부", 5000, 3);
        orders[2] = createOrder("우유", 5000, 3);

        printOrder(orders);

        System.out.println("주문 총액은 : "+ getTotalAmount(orders));

    }
    public static ProductOrder2 createOrder(String Name, int price, int quantity)
    {
        ProductOrder2 pd = new ProductOrder2();
        pd.productName = Name;
        pd.price = price;
        pd.quantity = quantity;

        return pd;
    }

    static void printOrder(ProductOrder2[] orders)
    {
     for(int i = 0; i < orders.length; i++)
     {
         System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
     }

    }

    static int getTotalAmount(ProductOrder2[] orders)
    {
        int sum = 0;
        for(int i = 0; i < orders.length; i++)
        {
            sum += orders[i].price*orders[i].quantity;

        }
        return sum;
    }



}
