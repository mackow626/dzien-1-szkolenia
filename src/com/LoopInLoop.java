package com;

public class LoopInLoop {

    public static void main(String[] args) {
        int[][] ints = new int[2][3];
        int counter = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int y = 0; y < ints[i].length; y++) {
                ints[i][y]= counter;
                counter++;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            for (int y = 0; y < ints[i].length; y++) {
                System.out.println(ints[i][y]);
            }
        }


    }

}
