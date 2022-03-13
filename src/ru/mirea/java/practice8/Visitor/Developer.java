package ru.mirea.java.practice8.Visitor;

public interface Developer {
    void create(Code code);
    void create(Database database);
    void create(Test test);
}
