module com.example.eventseventhandlers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventseventhandlers to javafx.fxml;
    exports com.example.eventseventhandlers;
}