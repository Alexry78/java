package products;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();
    
    public boolean addProduct(Product product) {
        if (!products.contains(product)) {
            return products.add(product);
        }
        return false; // продукт уже в корзине
    }

    public void removeHeavyOrExpensiveProducts() {
        products.removeIf(product -> product.getWeight() > 5 || product.getPrice() > 10000);
    }

    public void makeFavoriteFirst(Product favorite) {
        products.remove(favorite);
        products.add(0, favorite);
    }

    public void printAffordableLightProducts() {
        products.stream()
                .filter(product -> product.getPrice() < 10 && product.getWeight() > 2)
                .forEach(System.out::println);
    }

    public void printAllProducts() {
        products.forEach(System.out::println);
    }
}
