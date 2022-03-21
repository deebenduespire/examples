package com.espire.strategypattern.simple;

public abstract class IntProcessor {

    protected abstract int f(int x);

    public void operateOn(int x) {
        int y = f(x);
        System.out.println(x + " becomes " + y);
    }
}
