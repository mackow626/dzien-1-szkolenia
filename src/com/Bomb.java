package com;

import java.util.Scanner;

public class Bomb {

    public static void main(String[] args) {
        System.out.println("Bomba wybuchnie za ");
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        for (int i = counter; i > 0; i--) {
            System.out.println("bomba wybuchnie za " + i);
        }

        System.out.println(" BOOOOOOM ");




    }

}
