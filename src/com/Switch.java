package com;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Prosze podaj imie");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name){
            case "Maciek":
                System.out.println("czesc " + name);
                break;
            case "Lukasz":
                System.out.println("czesc " + name);
                break;
            case "Ewa":
                System.out.println("czesc " + name);
                break;
            default:
                System.out.println("przykro mi nie znam Cie");
        }


    }

}
