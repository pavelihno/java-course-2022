package ru.mirea.java.practice6.Prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype concreteObject = new ConcretePrototype();
        concreteObject.setType(ConcretePrototype.Type.ONE);
        ConcretePrototype clone = concreteObject.clone();

        System.out.println(concreteObject);
        System.out.println(clone);
    }
}