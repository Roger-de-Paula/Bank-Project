package com.example.bank_project;

public interface IAccount {

    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, IAccount destine);
    void  bankExtract();

}