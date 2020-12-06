package com;

import java.util.Scanner;

public class Exercises1 {
    //liczy sumę n początkowych liczb naturalnych podzielnych przez 5.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
