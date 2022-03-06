package ru.mirea.java.practice6.Factory;

public class CreamCake extends Product {
    @Override
    public void makeProduct(){}
    @Override
    public void printMessage(){
        System.out.println("Вот ваш CreamCake! Спасибо, приходите еще!");
    }
}