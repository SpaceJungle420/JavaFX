module com.example.sliderspinnercolorpickerdatepickercontrols {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sliderspinnercolorpickerdatepickercontrols to javafx.fxml;
    exports com.example.sliderspinnercolorpickerdatepickercontrols;
}