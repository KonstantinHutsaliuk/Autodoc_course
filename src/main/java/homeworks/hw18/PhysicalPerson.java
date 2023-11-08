package homeworks.hw18;

public class PhysicalPerson extends Client {
    public PhysicalPerson(double balance) {
        setBalance(balance);
    }

    @Override
    double depositConditions() {
        return 0.0;
    }

    @Override
    double withdrawalConditions() {
        return 0.0;
    }

    @Override
    void info() {
        System.out.println("Условие пополнения для физического лица: без комиссии ");
        System.out.println("Условие снятия для физического лица: без комиссии");
        System.out.println("Ваш баланс: " + getBalance());
    }
}
