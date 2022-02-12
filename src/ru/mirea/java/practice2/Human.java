package ru.mirea.java.practice2;

import java.time.LocalDate;

public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;

    public Human(int age, String lastName, int weight) {
        this.age = age;
        this.lastName = lastName;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s, возраст: %d, вес: %d", lastName, age, weight);
    }
}
