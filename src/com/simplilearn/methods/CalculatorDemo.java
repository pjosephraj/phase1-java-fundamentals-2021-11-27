package com.simplilearn.methods;

import java.util.Scanner;

public class CalculatorDemo {

  private static Scanner input;
  public static void main(String[] args) {
    // Step 1. Collect input from user console
    input = new Scanner(System.in);
    System.out.println("---------------------------------");
    System.out.println(":: Calculator ::");
    System.out.println("---------------------------------");

    System.out.println(("::Enter a number 1 value::"));
    int x = input.nextInt();

    System.out.println(("::Enter a number 2 value::"));
    int y = input.nextInt();

    // Step 2. Call Arithmatic Calculator functon
    Calculator calculator = new Calculator();
    System.out.println("X is " + x + " , Y is " + y + " And Addition: " + calculator.add(x, y));
    System.out.println("X is " + x + " , Y is " + y + " And Substraction: " + calculator.sub(x, y));
    System.out.println("X is " + x + " , Y is " + y + " And Multiplication: " + calculator.mul(x, y));
    System.out.println("X is " + x + " , Y is " + y + " And Division: " + calculator.div(x, y));
    System.out.println("X is " + x + " , Y is " + y + " And Average: " + calculator.avg(x, y));

  }
}

class Calculator {

  // Addition

  public float add(int num1, int num2) {
    float result = num1 + num2;
    return result;
  }

  // Substraction
  public float sub(int num1, int num2) {
    float result = num1 - num2;
    return result;
  }

  // Multiplication
  public float mul(int num1, int num2) {
    float result = num1 * num2;
    return result;
  }

  // Division
  public float div(int num1, int num2) {
    float result = num1 / num2;
    return result;
  }

  // Division
  public float avg(int num1, int num2) {
    float result = (num1 + num2) / 2;
    return result;
  }
}
