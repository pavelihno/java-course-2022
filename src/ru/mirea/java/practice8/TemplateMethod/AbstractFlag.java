package ru.mirea.java.practice8.TemplateMethod;

public abstract class AbstractFlag {
    abstract void getCountryName();
    abstract void drawUpperLine();
    abstract void drawMiddleLine();
    abstract void drawLowerLine();

    public void drawFlag() {
        getCountryName();
        drawUpperLine();
        drawMiddleLine();
        drawLowerLine();
    }
}
