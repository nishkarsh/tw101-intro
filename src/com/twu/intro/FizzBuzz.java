package com.twu.intro;

/**
 * Created by nishkarshsharma on 11/01/15.
 */
public class FizzBuzz {
    public void print() {
        for (int i = 1; i <= 100; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
