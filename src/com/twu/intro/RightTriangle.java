package com.twu.intro;

public class RightTriangle {

    public void print(int height) {

        for (int lineNumber = 0; lineNumber < height; lineNumber++) {
            for (int numAsterisk = 0; numAsterisk <= lineNumber; numAsterisk++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
