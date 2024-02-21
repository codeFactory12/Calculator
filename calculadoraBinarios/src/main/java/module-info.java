module com.example.calculadorabinarios {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.kordamp.bootstrapfx.core;

  opens com.example.calculadorabinarios to javafx.fxml;
  exports com.example.calculadorabinarios;
}