package com.twu.intro;

public class Launcher {

    public static void main(String[] args) {
        new Asterisk().print();

        new HorizontalLine().print(8);

        new RightTriangle().print(5);

        new IsoscelesTriangle().print(3);

        new DiamondPattern().print(4);

        new DiamondWithName().print(4);

        new FizzBuzz().print();
    }
}
