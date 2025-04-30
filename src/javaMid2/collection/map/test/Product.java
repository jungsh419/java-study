package javaMid2.collection.map.test;

import java.util.Objects;

public class Product {
    private String name;
    private Integer price;

    public Product(String name, Integer count) {
        this.name = name;
        this.price = count;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + price +
                '}';
    }
}
