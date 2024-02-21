package com.example.calculadorabinarios.calculation;

public interface Operation {
  String addition(String binaryA, String binaryB, int base);
  String subtraction(String binaryA, String binaryB, int base);
  String multiplication(String binaryA, String binaryB, int base);
  String division(String binaryA, String binaryB, int base);
}
