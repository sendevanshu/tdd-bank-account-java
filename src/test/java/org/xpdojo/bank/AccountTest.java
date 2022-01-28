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
}
