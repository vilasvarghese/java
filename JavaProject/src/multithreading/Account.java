public class Account {

    private String accountId;
    private String accountName;
    private int balance;

    public Account(String accountId, String accountName, int balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
