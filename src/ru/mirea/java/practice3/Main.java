package ru.mirea.java.practice3;

import java.util.*;

public class Main {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static LockList<Integer> lockList = new LockList<>();

    public static LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    public static SemaphoreMap<Integer, Integer> semaphoreMap = new SemaphoreMap<>();

    public static void main(String[] args) throws Exception{
        System.out.println("ArrayList: ");
        testList(arrayList);
        System.out.println("\nLockList: ");
        testList(lockList);

        System.out.println("\nMap:");
        testMap(map);
        System.out.println("\nSemaphoreMap:");
        testMap(semaphoreMap);
    }

    public static void testList(List<Integer> list) throws Exception {
        Thread one = new Thread(()->{
            for (int i = 0; i < 50; i++)
                list.add(i);
        });
        Thread two = new Thread(()->{
            for (int i = 51; i < 100; i++)
                list.add(i);
        });
        one.start();
        two.start();
        Thread.sleep(1000);

        for (Integer i : list)
            System.out.print(i + " ");
    }

    public static void testMap(Map<Integer, Integer> map) throws Exception {
        Thread three = new Thread(()->{
            for (int i = 0; i < 50; i++)
                map.put(i, i);
        });
        Thread four = new Thread(()->{
            for (int i = 51; i < 100; i++)
                map.put(i, i);
        });
        three.start();
        four.start();
        Thread.sleep(1000);

        for (Integer i : map.keySet())
            System.out.print(i + " ");
    }
}
