package homeworks.hw18;

abstract class Client {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void depositCard(double addDeposit){
        setBalance(getBalance() + addDeposit);
    }

    void withdraw(double withdrawCash) throws NegativeBalanceException, InsufficientFundsException{
        if (getBalance() - withdrawCash < 0) {
            throw new NegativeBalanceException();
        } else if (getBalance() < 0) {
            throw new InsufficientFundsException();
        } else {
            setBalance(getBalance() - withdrawCash);
        }
    }

    abstract double depositConditions();

    abstract double withdrawalConditions();

    abstract void info();

}
