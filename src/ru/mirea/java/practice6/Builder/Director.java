package ru.mirea.java.practice6.Builder;

public class Director {
    private final CarBuilder builder;

    public Director(CarBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Director can't work without Builder!");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().getResult();    }
}
