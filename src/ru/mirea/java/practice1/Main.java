package ru.mirea.java.practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // вариант 9
        // Имплементировать интерфейс Predicate, определяющий, является ли
        // данная строка PIN-кодом (содержит ровно 4 цифры или 6 цифр)

        Predicate predicate = (String str)-> str.matches("(\\d{6}|\\d{4})");

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(
                "1234",
                "12345",
                "123456",
                "a3214",
                "psss"
        ));

        for (String str: stringList) {
            System.out.printf("%s: %s%n", str, predicate.isPINCode(str) ? "PIN Code" : "Not PIN Code");
        }
    }
}
