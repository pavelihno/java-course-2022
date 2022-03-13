package ru.mirea.java.practice8.TemplateMethod;

public class SerbianFlag extends  AbstractFlag {
    @Override
    void getCountryName() {
        System.out.println("Сербский флаг");
    }

    @Override
    void drawUpperLine() {
        Colors.paintRedLine();
    }

    @Override
    void drawMiddleLine() {
        Colors.paintBlueLine();
    }

    @Override
    void drawLowerLine() {
        Colors.paintWhiteLine();
    }
}
