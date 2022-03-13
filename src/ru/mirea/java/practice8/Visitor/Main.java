package ru.mirea.java.practice8.Visitor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer senior = new SeniorDeveloper();
        Developer junior = new JuniorDeveloper();

        project.writtenBy(senior);
        project.writtenBy(junior);
    }
}
