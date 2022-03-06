package ru.mirea.java.practice6.AbstractFactory;

public class AppleCake implements AbstractFood {
    @Override
    public void makeProduct(){}
    @Override
    public void printMessage(){
        System.out.println("Вот ваш AppleCake!");
    }
}
