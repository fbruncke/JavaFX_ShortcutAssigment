module com.example.javafx_shortcutassigment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_shortcutassigment to javafx.fxml;
    exports com.example.javafx_shortcutassigment;
}