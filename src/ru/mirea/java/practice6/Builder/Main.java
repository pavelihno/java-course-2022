package ru.mirea.java.practice6.Builder;

public class Main {
    public static void main(String[] args) {
        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        ClassicCarBuilder classicCarBuilder = new ClassicCarBuilder();
        Director sportsCarDirector = new Director(sportsCarBuilder);
        Director classicCarDirector = new Director(classicCarBuilder);

        Car sportsCar = sportsCarDirector.manufactureCar();
        System.out.println(sportsCar);
        System.out.println();

        Car classicCar = classicCarDirector.manufactureCar();
        System.out.println(classicCar);
    }
}
