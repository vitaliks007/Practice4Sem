package com.Vitaliy.task2;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Human> humans = new ArrayList<>();

        FileReader fileReader = new FileReader("input.txt");
        Scanner in = new Scanner(fileReader);

        while (in.hasNextLine()) {
            humans.add(new Human(in.nextInt(), in.next(), in.next(),
                    LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt()), in.nextInt()));
        }
        fileReader.close();

        humans = humans.stream().sorted(Comparator.comparing(elem -> elem.getAge() + elem.getWeight()))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(humans);

        humans = humans.stream().filter(elem -> elem.getWeight() % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(humans);

        humans = humans.stream().limit(4)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(humans);

        System.out.println(humans.stream().map(Human::getFirstName).collect(Collectors.joining(" ")));
    }
}
