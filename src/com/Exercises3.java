package com;

import java.util.Scanner;

public class Exercises3 {
    //dla wczytanej z klawiatury liczby naturalnej n wypisuje jej dzielniki

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbe");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number%i==0) {
                System.out.println(i);
            }
        }
    }
}
