package ru.mirea.java.practice6.Prototype;

public class ConcretePrototype implements Prototype {
    private Type type;
    public enum Type {
        ONE, TWO
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype complicatedObject = new ConcretePrototype();
        complicatedObject.setType(type);
        return complicatedObject;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "type=" + type +
                '}';
    }
}