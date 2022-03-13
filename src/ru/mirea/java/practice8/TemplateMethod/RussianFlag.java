package ru.mirea.java.practice8.TemplateMethod;

public class RussianFlag extends AbstractFlag {
    @Override
    void getCountryName() {
        System.out.println("Российский флаг");
    }

    @Override
    void drawUpperLine() {
        Colors.paintWhiteLine();
    }

    @Override
    void drawMiddleLine() {
        Colors.paintBlueLine();
    }

    @Override
    void drawLowerLine() {
        Colors.paintRedLine();
    }
}
