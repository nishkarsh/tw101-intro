package com.twu.intro;

public class DiamondPattern {
    public void print(int n) {

        for (int i = 1; i < n * 2 -1; i = i+2) {
            for(int j = 1; j < n - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n * 2 - 4 ; i > 0; i -= 2) {
            for (int j = 1; j < n - i / 2; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
