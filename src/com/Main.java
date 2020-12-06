package com;

public class Main {

    public static void main(String[] args) {
        int x = 12;

        if (x % 2 == 0) {
            System.out.println("to jest liczba parzysta");
        } else {
            System.out.println("liczba nie jest parzysta");
        }

        if (x > 10) {
            System.out.println("liczba jest wieksza od 10");
        } else if (x == 10) {
            System.out.println("liczba jest rowna 10");
        } else {
            System.out.println("liczba jest mniejsza od dziesieciu");
        }



    }
}
