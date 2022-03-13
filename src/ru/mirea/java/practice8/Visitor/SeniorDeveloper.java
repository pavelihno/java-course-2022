package ru.mirea.java.practice8.Visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(Code code) {
        System.out.println("Write correct code");
    }

    @Override
    public void create(Database database) {
        System.out.println("Run database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Apply reliable test");
    }
}
