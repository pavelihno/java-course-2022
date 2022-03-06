package ru.mirea.java.practice6.AbstractFactory;

public class AlcoholSet implements AbstractSet {
    AppleCake appleCake;
    AlcoholCocktail alcoholCocktail;

    public AlcoholSet createSet(){
        createProductFood();
        createProductDrink();
        System.out.println("Спасибо за заказ! Спасибо, приходите еще!");
        return this;
    }

    @Override
    public AbstractFood createProductFood() {
        appleCake = new AppleCake();
        appleCake.printMessage();
        return appleCake;
    }

    @Override
    public AbstractDrink createProductDrink() {
        alcoholCocktail = new AlcoholCocktail();
        alcoholCocktail.printMessage();
        return alcoholCocktail;
    }
}