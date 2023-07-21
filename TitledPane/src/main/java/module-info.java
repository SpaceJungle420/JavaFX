module com.example.titledpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.titledpane to javafx.fxml;
    exports com.example.titledpane;
}