package ru.mirea.java.practice8.Visitor;

public class Project implements Element {

    @Override
    public void writtenBy(Developer developer) {
        new Code().writtenBy(developer);
        new Database().writtenBy(developer);
        new Test().writtenBy(developer);
    }
}
