module com.example.comboboxchoicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comboboxchoicebox to javafx.fxml;
    exports com.example.comboboxchoicebox;
}