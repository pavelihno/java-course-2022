package ru.mirea.java.practice6.Builder;

public interface CarBuilder {
    CarBuilder fixChassis();
    CarBuilder fixBody();
    CarBuilder paint();
    CarBuilder fixInterior();

    Car getResult();
}