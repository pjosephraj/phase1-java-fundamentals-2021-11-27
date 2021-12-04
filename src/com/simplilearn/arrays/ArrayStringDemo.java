package com.simplilearn.arrays;

import java.util.Arrays;

import com.simplilearn.utils.UtilsDemo;

public class ArrayStringDemo {
  public static void main(String[] args) {
    // String array
    String[] names = { "John", "Mike", "David", "William", "Ruby", "Mary" };

    System.out.println(Arrays.toString(names));
    System.out.println(names.length);

    // Get element by index
    System.out.println("Element at index 0: " + names[0]);
    System.out.println("Element at index 5: " + names[5]);

    // Array's Index Out Of Bounds Exception
    // System.out.println("Element at index 6 :" +names[6]); //

    UtilsDemo.printDL();

    for (int index = 0; index < names.length; index++) {
      System.out.println("Index: " + index + ", value: " + names[index]);
    }
  }
}
