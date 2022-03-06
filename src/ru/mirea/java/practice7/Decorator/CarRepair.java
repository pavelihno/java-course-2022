package ru.mirea.java.practice7.Decorator;

public class CarRepair implements Service  {
    private String label;
    private double price;

    public CarRepair(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}