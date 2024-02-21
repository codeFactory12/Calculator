package com.example.calculadorabinarios.calculation;

import java.math.BigInteger;

public class Conversor {

  public static String convertDectoOther(String num, int base){
    BigInteger dec = new BigInteger(num, detectBase(num));
    return dec.toString(base);
  }

  public static int detectBase(String num){
    num = num.trim();

    if (num.matches("[01]+")) {
      return 2;
    } else if (num.matches("[0-7]+")) {
      return 8;
    } else if (num.matches("[0-9A-Fa-f]+")) {
      return 16;
    } else {
      return 10;
    }
  }
}
