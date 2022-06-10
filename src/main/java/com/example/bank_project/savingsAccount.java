package com.example.bank_project;

public class savingsAccount extends Account {
    @Override
    public void bankExtract() {
        System.out.println("===Extract Savings Account===");
        super.printInformations();
    }
}
