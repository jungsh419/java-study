package javaMid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product,Integer> cartMap = new HashMap<>();

    public void add(Product product, Integer Quantity)
    {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity + Quantity;

        cartMap.put(product,newQuantity);

    }
    public void minus(Product product, Integer Quantity)
    {
        int existingQuantity = cartMap.getOrDefault(product, 0);

        int newQuantity = existingQuantity - Quantity;
        if(newQuantity<=0)
        {
            cartMap.remove(product);
        }
        else
        {
            cartMap.put(product,newQuantity);
        }
    }

    public void printAll()
    {
        System.out.println("== 모든 상품 출력 ==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " +
                    entry.getValue());

        }
    }



}
