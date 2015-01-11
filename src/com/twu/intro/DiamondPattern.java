package com.twu.intro;

public class DiamondPattern {
    public void print(int depth) {

        int centreSize = (2 * depth) - 1;

        for (int i = 0; i < depth; i++) {
            int numAsterisk = (2 * i) + 1;
            int numSpaces = (centreSize - numAsterisk) / 2;

            for (int j = 0; j < numSpaces; j++)
                System.out.print(" ");

            for (int k = 0; k < numAsterisk; k++)
                System.out.print("*");

            System.out.println();
        }

        int iterations = depth - 1;

        for (int i = iterations; i > 0; i--) {
            int numAsterisk = (2 * i) - 1;
            int numSpaces = (centreSize - numAsterisk) / 2;

            for (int j = 0; j < numSpaces; j++)
                System.out.print(" ");

            for (int k = 0; k < numAsterisk; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
