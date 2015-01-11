package com.twu.intro;

import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {
        new Asterisk().print();

        new HorizontalLine().print(8);

        new VerticalLine().print(10);

        new RightTriangle().print(5);

        new IsoscelesTriangle().print(3);

        new DiamondPattern().print(4);

        new DiamondWithName().print(4);

        new FizzBuzz().print();

        ArrayList<Integer> primeFactors= new ArrayList<Integer>();
        primeFactors = new PrimeFactors().generate(30);
        System.out.print(primeFactors);
    }
}
