module com.example.bank_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bank_project to javafx.fxml;
    exports com.example.bank_project;
}