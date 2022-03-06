package ru.mirea.java.practice5;

public enum SingletonEnum {
    INSTANCE;
    private String info = "Initial info class";
    public SingletonEnum getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
