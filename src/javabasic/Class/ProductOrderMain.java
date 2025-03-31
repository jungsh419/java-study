package javabasic.Class;

import javax.swing.*;
import java.lang.constant.PackageDesc;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] pos = new ProductOrder[2];
        int totalAmount = 0;

        ProductOrder po1 = new ProductOrder();
        po1.productName = "두부";
        po1.price = 3000;
        po1.quantity =5;
        pos[0] = po1;

        ProductOrder po2 = new ProductOrder();
        po2.productName = "김치";
        po2.price = 2000;
        po2.quantity =3;
        pos[1] = po2;


        for(int i=0;i<pos.length;i++)
        {
            System.out.println("상품명 : " +pos[i].productName +" 가격 : "+ pos[i].price + "수량 : " + pos[i].quantity );
        }

        for (ProductOrder order : pos) {
            System.out.println("상품명: " + order.productName + ", 가격: " +
                    order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);

    }
}
