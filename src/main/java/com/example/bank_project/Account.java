package com.example.bank_project;

public abstract class Account implements IAccount{
    private static  final int STANDARD_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;


    public Account() {
        this.agency = Account.STANDARD_AGENCY;
        this.number = SEQUENTIAL++;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);

    }

    protected void printInformations() {
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
