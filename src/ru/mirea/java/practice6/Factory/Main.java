package ru.mirea.java.practice6.Factory;

public class Main {
    public static void main(String[] args) {
        DrinkShop drinkShop = new DrinkShop();
        drinkShop.orderProduct(ProductType.ALCOHOL_COCKTAIL);

        FoodShop foodShop = new FoodShop();
        foodShop.orderProduct(ProductType.CREAM_CAKE);
    }
}