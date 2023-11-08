package homeworks.hw18;

public class Launcher {
    public static void main(String[] args) throws NegativeBalanceException, InsufficientFundsException {

        PhysicalPerson physicalPerson = new PhysicalPerson(1000.0);
        physicalPerson.info();
        physicalPerson.withdraw(500.0);
        System.out.println(physicalPerson.getBalance());
        physicalPerson.depositCard(300.0);
        System.out.println(physicalPerson.getBalance());
        System.out.println();

        LegalPerson legalPerson = new LegalPerson(1000.00);
        legalPerson.info();
        legalPerson.withdraw(500);
        System.out.println(legalPerson.getBalance());
        legalPerson.depositCard(300.0);
        System.out.println(legalPerson.getBalance());
        System.out.println();

        IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur(1000);
        individualEntrepreneur.info();
        individualEntrepreneur.withdraw(500.0);
        System.out.println(individualEntrepreneur.getBalance());
        individualEntrepreneur.depositCard(100.0);
        System.out.println(individualEntrepreneur.getBalance());
        individualEntrepreneur.depositCard(2000.0);
        System.out.println(individualEntrepreneur.getBalance());

    }
}
