package com;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            integerList.add(i);
        }

        integerList.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i -> integerList.set(i, i * 2));

        integerList.forEach(System.out::println);
    }

}
