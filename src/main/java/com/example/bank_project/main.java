package com.example.bank_project;

public class main {
    public static void main(String[] args) {
        checkingAccount ca = new checkingAccount();
        savingsAccount sa = new savingsAccount();


        ca.transfer(100, sa);

        ca.bankExtract();
        sa.bankExtract();
    }
}
