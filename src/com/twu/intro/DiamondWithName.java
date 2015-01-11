package com.twu.intro;

public class DiamondWithName {
    public void print(int depth) {

        int centreSize = (2 * depth) - 1;

        for (int i = 0; i < depth - 1; i++) {
            int asteriskCount = (2 * i) + 1;
            int numSpaces = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < numSpaces; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        System.out.println("Nishkarsh");

        int iterations = depth - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int numSpaces = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < numSpaces; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
