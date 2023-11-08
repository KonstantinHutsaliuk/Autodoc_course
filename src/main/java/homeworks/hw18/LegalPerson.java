package homeworks.hw18;

public class LegalPerson extends Client {
    public LegalPerson(double balance) {
        setBalance(balance);
    }

    @Override
    void withdraw(double withdrawCash) throws NegativeBalanceException, InsufficientFundsException {
        if ((getBalance() - withdrawCash) - withdrawCash * withdrawalConditions() < 0) {
            throw new NegativeBalanceException();
        } else if (getBalance() < 0) {
            throw new InsufficientFundsException();
        } else {
            setBalance((getBalance() - withdrawCash) - withdrawCash * withdrawalConditions());
        }
    }

    @Override
    double depositConditions() {
        return 0.0;
    }

    @Override
    double withdrawalConditions() {
        return 0.01;
    }

    @Override
    void info() {
        System.out.println("Условие пополнения для юридического лица: без комиссии ");
        System.out.println("Условие снятия для юридического лица: " + withdrawalConditions() * 100 + '%');
        System.out.println("Ваш баланс: " + getBalance());
    }
}
