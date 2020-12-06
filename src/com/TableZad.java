package com;

import java.util.Scanner;

public class TableZad {

    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("podaj liczbe imion");
        int counter = scannerInt.nextInt();
        String[] names = new String[counter];

        for (int i=0;i<names.length;i++){
            System.out.println("Podaj imię ");
            names[i]=scannerString.nextLine();
        }

        for (int i=0;i<names.length;i++){
            System.out.println("Witaj " + names[i]);
        }
    }

}
