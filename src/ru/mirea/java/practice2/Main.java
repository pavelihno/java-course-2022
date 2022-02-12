package ru.mirea.java.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // вариант 9
        //  Фильтрация по признаку «вес больше, чем возраст», сортировка по
        //  фамилии в обратном порядке, сумма всех весов.

        ArrayList<Human> humanList = new ArrayList<>();

        ArrayList<String> lastNameList = new ArrayList<>(Arrays.asList(
                "Иванов",
                "Арсеналов",
                "Языков",
                "Петров",
                "Ильин",
                "Герасимова",
                "Бондарева"
        ));

        ArrayList<Integer> ageList = new ArrayList<>(Arrays.asList(
                34,
                18,
                1,
                90,
                35,
                68,
                53
        ));

        ArrayList<Integer> weightList = new ArrayList<>(Arrays.asList(
                70,
                59,
                9,
                53,
                74,
                68,
                60
        ));

        for (int i = 0; i < lastNameList.size(); i++) {
            Human human = new Human(ageList.get(i), lastNameList.get(i), weightList.get(i));
            humanList.add(human);
        }

        // Изначальный поток
        Stream<Human> stream = humanList.stream();

        // Отфильтрованный поток "вес > возраст"
        Stream<Human> streamFiltered = humanList.stream()
                .filter(human -> human.getWeight() > human.getAge());

        // Сортированный поток "-фамилия"
        Stream<Human> streamSorted = humanList.stream()
                .filter(human -> human.getWeight() > human.getAge())
                .sorted(Comparator.comparing(Human::getLastName).reversed());

        // Сумма всех весов
        int sum = humanList.stream()
                .filter(human -> human.getWeight() > human.getAge())
                .sorted(Comparator.comparing(Human::getLastName).reversed())
                .reduce(0, (a, b)->a+b.getWeight(), Integer::sum);

        System.out.println("Изначальный поток");
        stream.forEach(System.out::println);

        System.out.println("\nОтфильтрованный поток \"вес > возраст\"");
        streamFiltered.forEach((System.out::println));

        System.out.println("\nСортированный поток \"-фамилия\"");
        streamSorted.forEach((System.out::println));

        System.out.println("\nСумма всех весов: "+sum);
    }
}
