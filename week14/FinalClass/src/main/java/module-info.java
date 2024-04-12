module com.example.finalclass {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.finalclass to javafx.fxml;
    exports com.example.finalclass;
}