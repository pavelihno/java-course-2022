package ru.mirea.java.practice6.AbstractFactory;

public class NonAlcoholSet implements AbstractSet {
    CreamCake creamCake;
    MilkCocktail milkCocktail;

    public NonAlcoholSet createSet(){
        createProductFood();
        createProductDrink();
        System.out.println("Спасибо за заказ! Спасибо, приходите еще!");
        return this;
    }

    @Override
    public AbstractFood createProductFood() {
        creamCake = new CreamCake();
        creamCake.printMessage();
        return creamCake;
    }

    @Override
    public AbstractDrink createProductDrink() {
        milkCocktail = new MilkCocktail();
        milkCocktail.printMessage();
        return milkCocktail;
    }
}