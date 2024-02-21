package com.example.calculadorabinarios.calculation;

import java.math.BigInteger;

public class BinaryOperations implements Operation{

  public boolean validateBase(int base){
    return base == 2;
  }
  @Override
  public String addition(String binaryA, String binaryB, int base) {
    try{
      if(validateBase(base)){
        BigInteger decimalA = new BigInteger(binaryA, base);
        BigInteger decimalB = new BigInteger(binaryB, base);
        BigInteger res = decimalA.add(decimalB);
        return res.toString(base);
      }else {
        throw new IllegalArgumentException("Invalid base. It must be 2.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Format error when converting binary to decimal: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Base validation error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Unknown error: " + e.getMessage());
    }
    return null;
  }

  @Override
  public String subtraction(String binaryA, String binaryB, int base) {
    try {
      if (validateBase(base)) {
        BigInteger decimalA = new BigInteger(binaryA, base);
        BigInteger decimalB = new BigInteger(binaryB, base);
        BigInteger res = decimalA.subtract(decimalB);
        return res.toString(base);
      } else {
        throw new IllegalArgumentException("Invalid base. It must be 2.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Format error when converting binary to decimal: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Base validation error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Unknown error: " + e.getMessage());
    }
    return null;
  }

  @Override
  public String multiplication(String binaryA, String binaryB, int base) {
    try {
      if (validateBase(base)) {
        BigInteger decimalA = new BigInteger(binaryA, base);
        BigInteger decimalB = new BigInteger(binaryB, base);
        BigInteger res = decimalA.multiply(decimalB);
        return res.toString(base);
      } else {
        throw new IllegalArgumentException("Invalid base. It must be 2.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Format error when converting binary to decimal: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Base validation error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Unknown error: " + e.getMessage());
    }
    return null;
  }

  @Override
  public String division(String binaryA, String binaryB, int base) {
    try {
      if (validateBase(base)) {
        BigInteger decimalA = new BigInteger(binaryA, base);
        BigInteger decimalB = new BigInteger(binaryB, base);

        if (decimalB.compareTo(BigInteger.ZERO) != 0) {
          BigInteger res = decimalA.divide(decimalB);
          return res.toString(base);
        } else {
          throw new ArithmeticException("Cannot divide by zero");
        }
      } else {
        throw new IllegalArgumentException("Invalid base. It must be 2.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Format error when converting binary to decimal: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Base validation error: " + e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Unknown error: " + e.getMessage());
    }
    return null;
  }

}
