package ru.mirea.java.practice6.Factory;

public class DrinkShop extends Shop {

    @Override
    protected Product createProduct(ProductType type) {
        return switch (type) {
            case MILK_COCKTAIL -> new MilkCocktail();
            case ALCOHOL_COCKTAIL -> new AlcoholCocktail();
            default -> null;
        };
    }
}
