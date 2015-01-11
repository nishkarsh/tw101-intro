package com.twu.intro;

public class FizzBuzz {

    public void print() {

        for (int number = 1; number <= 100; number++) {

            if(isDivisibleByThree(number) && isDivisibleByFive(number)) {
                System.out.println("FizzBuzz");
            }
            else if(isDivisibleByThree(number)) {
                System.out.println("Fizz");
            }
            else if(isDivisibleByFive(number)) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(number);
            }
        }
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }
}
