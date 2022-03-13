package ru.mirea.java.practice8.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractFlag russianFlag = new RussianFlag();
        AbstractFlag serbianFlag = new SerbianFlag();

        russianFlag.drawFlag();
        serbianFlag.drawFlag();
    }
}
