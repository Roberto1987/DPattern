package pragmaticTestJunit.thirdExample.test;

import org.junit.Before;
import org.junit.Test;
import pragmaticTestJunit.thirdExample.src.Account;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by rob on 5/12/17.
 */
public class AccountTest {

    private Account account;
    private final int referenceValue = 101;

    @Before
    public void preTest(){
        account = new Account();

    }


    @Test
    public void hasPositiveBalance() {
        account.deposit(50);
        assertTrue(account.hasPositiveBalance());
    }

    @Test
    public void depositIncreasesBalance() {
        int initialBalance = account.getBalance();
        account.deposit(100);
        assertTrue(account.getBalance() > initialBalance);
    }

    @Test
    public void balanceIsEqualTo(){
        account.deposit(101);
        assertThat(account.getBalance(),equalTo(referenceValue));

    }
}
