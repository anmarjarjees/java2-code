module com.example.finalreview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.finalreview to javafx.fxml;
    exports com.example.finalreview;
}