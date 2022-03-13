package ru.mirea.java.practice8.Visitor;

public class JuniorDeveloper implements Developer {

    @Override
    public void create(Code code) {
        System.out.println("Write incorrect code");
    }

    @Override
    public void create(Database database) {
        System.out.println("Database down");
    }

    @Override
    public void create(Test test) {
        System.out.println("Mistaken test");
    }
}
