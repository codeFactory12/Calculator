package com.example.calculadorabinarios;

import com.example.calculadorabinarios.calculation.BinaryOperations;
import com.example.calculadorabinarios.calculation.Conversor;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculatorController {
  private BinaryOperations binaryOperations = new BinaryOperations();
  @FXML
  private TextField converfield;

  @FXML
  private Text errortxt;

  @FXML
  private TextField resultField;

  @FXML
  private TextField firstnum;

  @FXML
  private TextField secondnum;

  @FXML
  private Text errorRestxt;

  @FXML
  private void handleBinary() {
    actionConver(2);
  }

  @FXML
  private void handleOctal() {
    actionConver(8);
  }

  @FXML
  private void handleHex() {
    actionConver(16);
  }

  @FXML
  private void handleDec() {
    actionConver(10);
  }

  @FXML
  private void handleAdd() {
    performBinaryOperation(BinaryOperations::addition);
  }

  @FXML
  private void handleSubs() {
    performBinaryOperation(BinaryOperations::subtraction);
  }

  @FXML
  private void handleMult() {
    performBinaryOperation(BinaryOperations::multiplication);
  }

  @FXML
  private void handleDiv() {
    performBinaryOperation(BinaryOperations::division);
  }

  private void performBinaryOperation(BinaryOperation operation) {
    try {
      errorRestxt.setVisible(false);
      String num1Binary = firstnum.getText();
      String num2Binary = secondnum.getText();
      if(num1Binary != null && num1Binary.length()!= 0 && num2Binary != null && num2Binary.length()!= 0){
        int base = 2;

        String resultBinary = operation.perform(binaryOperations, num1Binary, num2Binary, base);
        resultField.setText(resultBinary);
      }else{
        errorRestxt.setText("the number its null or empty");
        errorRestxt.setVisible(true);
      }
    } catch (IllegalArgumentException e) {
      errorRestxt.setText("Error: " + e.getMessage());
      errorRestxt.setVisible(true);
    }
  }
  interface BinaryOperation {
    String perform(BinaryOperations operations, String num1Binary, String num2Binary, int base);
  }

  public void actionConver(int base){
    try {
      errorRestxt.setVisible(false);
      if(converfield != null && converfield.getLength() != 0){
        String cad = converfield.getText();
        converfield.setText(Conversor.convertDectoOther(cad,base));
      }
    } catch (NumberFormatException e) {
      errortxt.setText("Invalid number with base: " + base);
      errortxt.setVisible(true);
    }
  }
}

