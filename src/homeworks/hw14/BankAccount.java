package homeworks.hw14;

public class BankAccount {
    private double balance;
    private String accountName;

    public BankAccount(String accountName, double money) {
        this.balance = money;
        this.accountName = accountName;
    }

    double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    void deposit(double addDeposit) {
        setBalance(getBalance() + addDeposit);
    }

    void withdraw(double withdrawCash) throws NegativeBalanceException, InsufficientFundsException {

        if (getBalance() - withdrawCash < 0) {
            throw new NegativeBalanceException();
        } else if (getBalance() < 0) {
            throw new InsufficientFundsException();
        } else {
            setBalance(getBalance() - withdrawCash);
        }
    }

    void transferTo(BankAccount bankAccount, double money) throws NegativeBalanceException, InsufficientFundsException {
        if (getBalance() - money < 0) {
            throw new NegativeBalanceException();
        } else if (getBalance() < 0) {
            throw new InsufficientFundsException();
        } else {
            setBalance(getBalance() - money);
            bankAccount.setBalance(bankAccount.getBalance() + money);
        }
    }
}
