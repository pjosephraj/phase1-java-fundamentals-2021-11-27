package com.simplilearn.arrays;

import com.simplilearn.utils.UtilsDemo;

public class ArraysDemo {
  public static void main(String[] args) {

    // Arrays : arrays is an ordered collection of similar type of data elements.
    int numbers[] = new int[5];

    // add elements in arrays
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    // get element
    System.out.println(numbers[0]);
    System.out.println(numbers[3]);

    // Array's Index Out Of Bounds Exception
    // numbers[5]=3030; 

    UtilsDemo.printDL();

    for (int index = 0; index < numbers.length; index++) {
      System.out.println("Index: " + index + ", value: " + numbers[index]);
    }
  }

}
