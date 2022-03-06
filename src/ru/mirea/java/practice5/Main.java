package ru.mirea.java.practice5;

public class Main {
    public static void main(String[] args) {
        LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();

        System.out.println(lazyInitializedSingleton1.getInfo());

        LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
        lazyInitializedSingleton2.setInfo("New class info");

        System.out.println(lazyInitializedSingleton1.getInfo());
        System.out.println(lazyInitializedSingleton2.getInfo());

        SingletonEnum enumSingleton1 = SingletonEnum.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo());

        SingletonEnum enumSingleton2 = SingletonEnum.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo());
        System.out.println(enumSingleton2.getInfo());
    }
}
