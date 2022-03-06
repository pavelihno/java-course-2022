package ru.mirea.java.practice6.Factory;

public class AppleCake extends Product {
    @Override
    public void makeProduct(){}
    @Override
    public void printMessage(){
        System.out.println("Вот ваш AppleCake! Спасибо, приходите еще!");
    }
}