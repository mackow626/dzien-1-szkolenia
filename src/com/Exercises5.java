package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises5 {
    // https://pl.spoj.com/problems/RNO_DOD/

    public static void main(String[] args) {

        System.out.println("podaj liczbe testow");
        Scanner scanner = new Scanner(System.in);
        int testsNumber = scanner.nextInt();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < testsNumber; i++) {
            int amountNumbersToSum = scanner.nextInt();
            int sum = 0;
            for (int y = 0; y < amountNumbersToSum; y++) {
                sum = sum + scanner.nextInt();
            }
            results.add(sum);
        }

        System.out.println(results);
    }
}
