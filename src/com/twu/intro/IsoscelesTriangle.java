package com.twu.intro;

public class IsoscelesTriangle {
    public void print(int height) {

        int baseSize = height * 2 - 1;

        for (int i = 0; i < height; i++) {
            int numAsterisk = (2 * i) + 1;
            int numSpaces = (baseSize - numAsterisk) / 2;

            for(int k = 0; k < numSpaces; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numAsterisk; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}