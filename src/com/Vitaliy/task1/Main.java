package com.Vitaliy.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String trash = in.nextLine();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(in.nextLine());
        }

        Consumer<ArrayList<String>> findUniq = x -> System.out.println(x.stream().max(Comparator.comparing(st -> st
                        .chars().mapToObj(i -> (char)i).distinct().count())).stream().collect(Collectors.joining()));
        findUniq.accept(strings);
    }
}
