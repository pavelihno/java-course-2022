package ru.mirea.java.practice6.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AlcoholSet alcoholSet = new AlcoholSet();
        NonAlcoholSet nonAlcoholSet = new NonAlcoholSet();

        alcoholSet.createSet();
        nonAlcoholSet.createSet();
    }
}