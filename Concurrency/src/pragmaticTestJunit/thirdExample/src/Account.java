package pragmaticTestJunit.thirdExample.src;

/**
 * Created by rob on 5/12/17.
 */
public class Account implements IAccount {

    public int getBalance() {
        return balance;
    }

    private int balance;

   public Account(){
       this.balance = 0;
   }

    @Override
    public void deposit(int cash) {
            this.balance += cash;
    }

    @Override
    public void withdraw(int cash) {
       if(this.balance-cash<0){
           throw new InsufficientFundsException();
       }
       else {
           this.balance -= cash;
       }
    }

    @Override
    public boolean hasPositiveBalance() {
        return balance>=0;
    }

    private void checkBalance() throws InsufficientFundsException {
       if(!this.hasPositiveBalance()){
           throw new InsufficientFundsException();
       }
    }
}
