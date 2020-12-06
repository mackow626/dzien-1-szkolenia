package com;

import java.util.Scanner;

public class SwitchZadOwoce {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaje nazwe owocu");
        String friutName = scanner.nextLine();

        System.out.println("Podaj ilosc owoców");
        int amountOfFruits = scanner.nextInt();

        switch (friutName) {
            case "pomarancze":
                if (amountOfFruits > 100) {
                    System.out.println(friutName + " jest za duzo o " +
                            (amountOfFruits - 100) + " kg");
                } else if (amountOfFruits == 100) {
                    System.out.println(friutName + " jest w sam raz");
                } else {
                    System.out.println("mamy jeszcze " +
                            (100 - amountOfFruits) + " kg miejsca");
                }
                break;
            case "banany":
                if (amountOfFruits > 100) {
                    System.out.println(friutName + " jest za duzo o " +
                            (amountOfFruits - 100) + " kg");
                } else if (amountOfFruits == 100) {
                    System.out.println(friutName + " jest w sam raz");
                } else {
                    System.out.println("mamy jeszcze " +
                            (100 - amountOfFruits) + " kg miejsca na " + friutName);
                }
                break;
            case "jablka":
                if (amountOfFruits > 100) {
                    System.out.println(friutName + " jest za duzo o " +
                            (amountOfFruits - 100) + " kg");
                } else if (amountOfFruits == 100) {
                    System.out.println(friutName + " jest w sam raz");
                } else {
                    System.out.println("mamy jeszcze " +
                            (100 - amountOfFruits) + " kg miejsca");
                }
                break;

        }
    }
}
