package com.espire.strategypattern.impl;


public class Test {

    /**
     * Another way to design this program is to not use subclassing. Instead
     * of implementing the strategy classes as subclasses of IntProcessor,
     * you can give them their own hierarchy, called a strategy hierarchy. The
     * hierarchy’s interface is named Operation, and has the method f. The
     * IntProcessor class, which no longer has any subclasses or abstract
     * methods, holds a reference to an Operation object and uses that reference
     * when it needs to call f.
     * The technique of organizing strategy classes into a hierarchy is called
     * the strategy pattern.
     * @param args
     */
    public static void main(String[] args) {
        Operation op1 = (Operation) new AddOne();
        Operation op2 = (Operation) new AddTwo();
        IntProcessor p1 = new IntProcessor(op1);
        IntProcessor p2 = new IntProcessor(op2);
        p1.operateOn(6);
        p2.operateOn(6);
    }
}
