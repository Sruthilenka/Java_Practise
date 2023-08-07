package Java_ExtendingConcept;

public interface USBank {

    int min_bal=100; // by default it is static and final

    public void credit();
    public void debit();
    public void transferMoney();
}
