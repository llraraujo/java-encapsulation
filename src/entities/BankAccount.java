package entities;

public class BankAccount {

    private int accountId;
    private String name;
    private double balance;
    private static final double TAX = 5.00;

    public BankAccount(int id, String name){
        this.accountId = id;
        this.name = name;
    }
    public BankAccount(int id, String name, double depositValue){
        this.accountId = id;
        this.name = name;
        deposit(depositValue);
    }

    public int getAccountId(){
        return this.accountId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit (double cash){
        this.balance += cash;
    }

    public void withdraw(double cash){
        this.balance -= (cash + TAX);
    }

    public String toString(){
        return "Account "+ getAccountId() + ", Holder: " + getName() + ", Balance: $ " + String.format("%.2f",getBalance());
    }

}
