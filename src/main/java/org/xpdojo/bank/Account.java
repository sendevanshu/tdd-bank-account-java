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

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        boolean canBeWithdrawn = false;
        if ((balance - amount) > 0) {
            canBeWithdrawn = true;
            balance -= amount;
        }
        return canBeWithdrawn;
    }

    public boolean transfer(Account account, int amount) {
        boolean canBeTransfer = withdraw(amount);
        if (canBeTransfer) {
            account.deposit(amount);
        }
        return canBeTransfer;
    }
}
