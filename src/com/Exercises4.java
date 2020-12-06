package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises4 {
    // wypisz liczby pierwsze z zakresu ponizej

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbe");
        int number = scanner.nextInt();

        List<Integer> integerList = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            integerList.add(i);
        }


        for (int i = 0; i < integerList.size(); i++) {
            for (int y = 2; y < i; y++) {
                if (i % y == 0) {
                    integerList.remove(i);
                }
            }
        }
    }
}
