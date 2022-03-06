package ru.mirea.java.practice6.Factory;

public class AlcoholCocktail extends Product {
    @Override
    public void makeProduct(){}
    @Override
    public void printMessage(){
        System.out.println("Вот ваш AlcoholCocktail! Спасибо, приходите еще!");
    }
}