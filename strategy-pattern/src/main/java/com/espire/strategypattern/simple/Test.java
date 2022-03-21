package com.espire.strategypattern.simple;

public class Test {

    public static void main(String[] args) {
        IntProcessor p1 = new AddOne();
        IntProcessor p2 = new AddTwo();
        p1.operateOn(6); // prints "6 becomes 7"
        p2.operateOn(6); // prints "6 becomes 8"
    }
}
