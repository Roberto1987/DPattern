package pragmaticTestJunit.thirdExample.src;

/**
 * Created by rob on 5/12/17.
 */
public interface IAccount {

    void deposit(int cash);

    void withdraw(int cash) throws InsufficientFundsException;

    boolean hasPositiveBalance();

}
