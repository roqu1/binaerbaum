module com.example.binaerbaum {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.binaerbaum to javafx.fxml;
    exports com.example.binaerbaum;
}