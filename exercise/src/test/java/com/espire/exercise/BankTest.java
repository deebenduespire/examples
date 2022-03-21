package com.espire.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTest {

    private static Bank bank = new Bank();

    @Test
    public void testNewAccount() {
        int acct = bank.newAccount();
        Assertions.assertNotNull(acct);
    }
}
