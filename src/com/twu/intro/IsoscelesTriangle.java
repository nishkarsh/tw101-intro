package com.twu.intro;

public class IsoscelesTriangle {
    public void print(int height) {

        for (int i = 1; i <= height * 2 - 1; i = i+2) {

            for(int k = 1; k < height - i / 2; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
