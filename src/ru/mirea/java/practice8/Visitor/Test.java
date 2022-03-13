package ru.mirea.java.practice8.Visitor;

public class Test implements Element {
    @Override
    public void writtenBy(Developer developer) {
        developer.create(this);
    }
}
