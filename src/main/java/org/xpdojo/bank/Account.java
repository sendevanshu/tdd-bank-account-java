package org.xpdojo.bank;

public class Account {
    int balance;
    public Account() {
        balance = 0;
    }
    public int getBalance() {
        return balance;
    }

    public static Account emptyAccount() {
        return new Account();
    }
}
