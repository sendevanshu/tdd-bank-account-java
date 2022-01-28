package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.emptyAccount;

public class AccountTest {

    @Test
    public void initialAccount_shouldHaveZeroBalance() {
        Account account = emptyAccount();
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void deposit() {
        Account account = emptyAccount();
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void deposit_WithNonZeroBalance() {
        Account account = emptyAccount();
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
        account.deposit(20);
        assertThat(account.getBalance()).isEqualTo(30);
    }

    @Test
    public void withdraw_withBalance() {
        Account account = emptyAccount();
        account.deposit(20);
        assertThat(account.getBalance()).isEqualTo(20);
        boolean isActionSuccessful = account.withdraw(10);
        assertThat(account.getBalance()).isEqualTo(10);
        assertThat(isActionSuccessful).isEqualTo(true);
    }

    @Test
    public void withdraw_withNoBalance() {
        Account account = emptyAccount();
        boolean isActionSuccessful = account.withdraw(10);
        assertThat(account.getBalance()).isEqualTo(0);
        assertThat(isActionSuccessful).isEqualTo(false);
    }
}
