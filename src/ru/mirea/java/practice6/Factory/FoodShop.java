package ru.mirea.java.practice6.Factory;

public class FoodShop extends Shop {

    @Override
    protected Product createProduct(ProductType type) {
        return switch (type) {
            case APPLE_CAKE -> new AppleCake();
            case CREAM_CAKE -> new CreamCake();
            default -> null;
        };
    }
}