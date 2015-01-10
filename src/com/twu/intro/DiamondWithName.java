package com.twu.intro;

public class DiamondWithName {
    public void print(int height) {

        int centreSize = (2 * height) - 1;

        for (int i = 0; i < height - 1; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        System.out.println("Nishkarsh");

        int iterations = height - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
