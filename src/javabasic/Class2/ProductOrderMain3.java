
package javabasic.Class2;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("입력할 주문의 개수를 입력하세요 : ");
        int count = scan.nextInt();
        scan.nextLine();

        ProductOrder2[] orders = new ProductOrder2[count];

        createOrder(scan,orders);

        printOrder(orders);

        System.out.println("주문 총액은 : "+ getTotalAmount(orders));

    }
    public static void createOrder(Scanner scan, ProductOrder2[] orders)
    {

        for(int i = 0; i<orders.length; i++)
        {
            ProductOrder2 pd = new ProductOrder2();
            System.out.println(i+1 +"번째 주문 정보를 입력하세요.");

            System.out.printf("이름 : ");
            pd.productName = scan.nextLine();

            System.out.printf("가격 : ");
            pd.price = scan.nextInt();


            System.out.printf("수량 : ");
            pd.quantity = scan.nextInt();
            scan.nextLine();
            orders[i] = pd;
        }

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

