package ru.mirea.java.practice7.Decorator;

public class OptionDecorator implements Service {
    private Service service;
    private String label;
    private double price;

    public OptionDecorator(Service service, String label, double price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price + service.getPrice();
    }

    public String getLabel() {
        return service.getLabel() + " и " + this.label;
    }
}
