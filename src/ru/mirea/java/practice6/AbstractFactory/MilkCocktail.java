package ru.mirea.java.practice6.AbstractFactory;

public class MilkCocktail implements AbstractDrink {
    @Override
    public void makeProduct(){}
    @Override
    public void printMessage(){
        System.out.println("Вот ваш MilkCocktail!");
    }
}
