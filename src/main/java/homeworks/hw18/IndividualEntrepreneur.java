package homeworks.hw18;

public class IndividualEntrepreneur extends Client {
    public IndividualEntrepreneur(double balance) {
        setBalance(balance);
    }

    @Override
    void depositCard(double addDeposit) {
        if (addDeposit > 1000.0) {
            setBalance((getBalance() + addDeposit) - addDeposit * depositConditions());
        } else setBalance((getBalance() + addDeposit) - addDeposit * depositConditions() * 2);
    }

    @Override
    double depositConditions() {
        return 0.005;
    }

    @Override
    double withdrawalConditions() {
        return 0.0;
    }

    @Override
    void info() {
        System.out.println("Условие пополнения для ИП: до 1000 = " + depositConditions() * 200 +
                "%, свыше 1000 = " + depositConditions() * 100 + '%');
        System.out.println("Условие снятия для ИП: без комиссии");
        System.out.println("Ваш баланс: " + getBalance());
    }
}
