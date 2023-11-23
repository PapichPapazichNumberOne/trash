module com.example.zalypa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.zalypa to javafx.fxml;
    exports com.example.zalypa;
}