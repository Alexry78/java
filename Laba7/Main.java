package products;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Random random = new Random();
        
        // Создание случайного набора продуктов
        for (int i = 0; i < 20; i++) {
            ProductName randomName = ProductName.values()[random.nextInt(ProductName.values().length)];
            Product product = new Product(randomName);
            cart.addProduct(product);
        }

        // Выбор любимого продукта
        Product favoriteProduct = new Product(ProductName.APPLE); // например, яблоко
        
        // Добавление любимого продукта в корзину
        cart.addProduct(favoriteProduct);

        // Удаление тяжелых или дорогих продуктов
        cart.removeHeavyOrExpensiveProducts();

        // Ставим любимый продукт на первое место
        cart.makeFavoriteFirst(favoriteProduct);

        // Вывод всех продуктов в корзине
        System.out.println("Все продукты в корзине:");
        cart.printAllProducts();

        // Вывод продуктов стоимостью < 10 и весом > 2
        System.out.println("Продукты стоимостью < 10 и весом > 2:");
        cart.printAffordableLightProducts();
    }
}
