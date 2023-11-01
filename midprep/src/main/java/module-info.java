module com.example.midprep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.midprep to javafx.fxml;
    exports com.example.midprep;
}