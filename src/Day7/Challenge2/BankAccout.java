package Day7.Challenge2;

public abstract class BankAccout implements Transactable {
    private String accountNumber;
    private double balance;
    private StringBuilder transactionHistory;
}
