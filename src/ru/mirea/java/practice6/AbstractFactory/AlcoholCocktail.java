package ru.mirea.java.practice6.AbstractFactory;

public class AlcoholCocktail implements AbstractDrink {
    @Override
    public void makeProduct(){}
    @Override
    public void printMessage(){
        System.out.println("Вот ваш AlcoholCocktail!");
    }
}