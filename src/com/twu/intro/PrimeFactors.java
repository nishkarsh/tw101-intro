package com.twu.intro;

import java.util.ArrayList;

public class PrimeFactors {

    public ArrayList<Integer> generate(int number) {
            ArrayList<Integer> primeFactorsList = new ArrayList<Integer>();

            for (int i = 2; i < number; i++) {
                if (isFactor(number, i) && isPrime(i))
                    primeFactorsList.add(i);
            }

            return primeFactorsList;
        }

        private boolean isPrime(int number) {
            for (int i = 2; i < number; i++) {
                if (isFactor(number, i))
                    return false;
            }

            return true;
        }

        private boolean isFactor(int firstNumber, int secondNumber) {
            return firstNumber % secondNumber == 0;
        }
    }
