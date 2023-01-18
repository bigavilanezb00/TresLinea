module com.example.treslinea {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.treslinea to javafx.fxml;
    exports com.example.treslinea;
}