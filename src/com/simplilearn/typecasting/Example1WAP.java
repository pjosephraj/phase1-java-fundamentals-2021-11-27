package com.simplilearn.typecasting;

import com.simplilearn.utils.UtilsDemo;

public class Example1WAP {
  // Convert int , byte , short  => float , double , long.

  public static void main(String[] args) {

    UtilsDemo.printDL();

    // Typecasting Int to Float
    int intValue = 200;
    float floatValue = intValue;

    // Typecasting Byte to Double
    byte byteValue = 10;
    double doubleValue = byteValue;

    // Typecasting Short to Long
    short shortValue = 200;
    long longValue = shortValue;

    // Print the Type casted values
    System.out.println("Integer => Float: " + intValue + " | " + floatValue);
    System.out.println("Byte => Double: " + byteValue + " | " + doubleValue);
    System.out.println("Short => Long: " + shortValue + " | " + longValue);

  }

}
