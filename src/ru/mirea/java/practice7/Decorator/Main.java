package ru.mirea.java.practice7.Decorator;

public class Main {
    public static void main(String[] args) {
        Service repair = new CarRepair("Починить машину", 1000);
        Service repairAndWashing = new CarRepairAndWashing(repair);

        System.out.println(repair.getLabel());
        System.out.println(repair.getPrice());

        System.out.println(repairAndWashing.getLabel());
        System.out.println(repairAndWashing.getPrice());
    }
}