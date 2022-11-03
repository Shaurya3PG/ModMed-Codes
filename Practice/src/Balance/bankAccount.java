package Balance;

public class bankAccount {
    private double accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private double phoneNo;

    public bankAccount(double accountNumber, int balance, String customerName,
                       String email, double phoneNo) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void deposit(int addBalance){
        balance = balance + addBalance;
        System.out.println("Balance added");
    }
    public void withdraw(int withBalance) {
        if (balance > withBalance) {
            balance = balance - withBalance;
            System.out.println("Balance withdrawn");
        }
        else{
            System.out.println("Not enough money you broke shit");
        }
    }
}
