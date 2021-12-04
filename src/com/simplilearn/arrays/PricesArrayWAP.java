package com.simplilearn.arrays;

import java.util.Arrays;

import com.simplilearn.utils.UtilsDemo;

public class PricesArrayWAP {
  public static void main(String[] args) {

    float[] prices = { 49.0f, 55.0f, 99.0f, 129.0f };

    System.out.println(Arrays.toString(prices));
    System.out.println("Prices array length: " + prices.length);

    UtilsDemo.printDL();

    for(int index = 0; index < prices.length; index++) {
      System.out.println("Price Index: " + index + ", Price Value: " + prices[index]);
    }

  }
}
