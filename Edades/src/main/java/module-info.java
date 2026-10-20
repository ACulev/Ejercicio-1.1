module com.mycompany.edades {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.edades to javafx.fxml;
    exports com.mycompany.edades;
}
