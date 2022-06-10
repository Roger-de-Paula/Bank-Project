package com.example.bank_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class checkingAccount extends Account {
    @Override
    public void bankExtract() {
        System.out.println("===Extract Checking Account===");
        super.printInformations();
    }
}