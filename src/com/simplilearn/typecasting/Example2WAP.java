package com.simplilearn.typecasting;

import com.simplilearn.utils.UtilsDemo;

public class Example2WAP {
  
  public static void main(String[] args) {
    // Convert long, float , int => byte , short double.

    UtilsDemo.printDL();

    // Typecasting Long => Byte
    long longValue = 20000000;
    byte byteValue = (byte) longValue;

    // Typecasting Float => Short
    float floatValue = 2000f;
    short shortValue = (short) floatValue;

    // Typecasting Int => Double
    int intValue = 2000;
    double doubleValue = intValue;

    // Print the typecasted
    System.out.println("Long => Byte: " + longValue + " | " + byteValue);
    System.out.println("Float => Short: " + floatValue + " | " + shortValue);
    System.out.println("Integer => Double: " + intValue + " | " + doubleValue);
    
  }
}
