module com.example.uithreads {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uithreads to javafx.fxml;
    exports com.example.uithreads;
}