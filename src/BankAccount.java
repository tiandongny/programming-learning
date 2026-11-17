public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(){
        this.accountHolder = "Unknown";
        this.accountNumber = "0000";
        this.balance = 0.0;
    }
    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public String getaccountHolder(){
        return accountHolder;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getaccountHolder());
    }
}
