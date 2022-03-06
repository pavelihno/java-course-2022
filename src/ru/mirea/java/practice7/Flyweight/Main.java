package ru.mirea.java.practice7.Flyweight;

public class Main {
    public static void main(String[] args) {
        LineFlyweightFactory factory = new LineFlyweightFactory();

        LineFlyweight redLine = factory.getLine("RED");
        LineFlyweight blackLine = factory.getLine("BLACK");
        redLine.draw(1);
        blackLine.draw(2);
        redLine.draw(3);
        blackLine.draw(4);
        System.out.println();

        factory.getPoolColors();
    }
}
