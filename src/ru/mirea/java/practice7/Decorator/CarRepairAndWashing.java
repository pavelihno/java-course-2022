package ru.mirea.java.practice7.Decorator;

public class CarRepairAndWashing extends OptionDecorator {
    public CarRepairAndWashing(Service service) {
        super(service, "Помыть машину", 500);
    }
}