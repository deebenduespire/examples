package com.espire.strategypattern.impl;

public class AddOne implements Operation {

    @Override
    public int f(int x) {
        return x + 1;
    }
}
