package com;

public class While {

    public static void main(String[] args) {

        int counter = 1;

        while (counter < 5) {
            System.out.println(" to jest pentla while");
            counter++;
        }

        int counterDoWhile = 1;

        do{
            System.out.println("to jest pentla do while");
            counterDoWhile++;
        }while (counterDoWhile <5);

    }
}
