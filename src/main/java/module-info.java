module com.example.radiobuttonmovingtext_syed {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.radiobuttonmovingtext_syed to javafx.fxml;
    exports com.example.radiobuttonmovingtext_syed;
}