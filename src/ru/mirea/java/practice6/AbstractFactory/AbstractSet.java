package ru.mirea.java.practice6.AbstractFactory;

public interface AbstractSet {
    AbstractFood createProductFood();
    AbstractDrink createProductDrink();
}