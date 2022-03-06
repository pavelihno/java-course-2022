package ru.mirea.java.practice5;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private String info = "Initial info class";

    private LazyInitializedSingleton() {}

    public synchronized static LazyInitializedSingleton getInstance() {
        if (instance == null)
            instance = new LazyInitializedSingleton();
        return instance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

