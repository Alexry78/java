package products;

import java.util.Random;

public class Product {
    private ProductName name;
    private double price;
    private double weight;

    public Product(ProductName name) {
        this.name = name;
        this.price = new Random().nextDouble() * 200; // случайная цена до 200
        this.weight = new Random().nextDouble() * 10; // случайный вес до 10 кг
    }

    public ProductName getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
