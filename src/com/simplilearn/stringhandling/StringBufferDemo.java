package com.simplilearn.stringhandling;

import com.simplilearn.utils.UtilsDemo;

public class StringBufferDemo {

  public static void main(String[] args) {

    // String with String Buffer
    StringBuffer text = new StringBuffer("Today is a good day!");
    System.out.println(text);
    UtilsDemo.printDL();

    // String Modification
    text.append(" Happy to work!");
    System.out.println(text);
    UtilsDemo.printDL();

    // Replace String
    text.replace(0, 1, "t");
    System.out.println(text);
    UtilsDemo.printDL();

    // Delete String
    text.delete(0, 2);
    System.out.println(text);
    UtilsDemo.printDL();

    // Insert String
    text.insert(0, "Welcome, ");
    System.out.println(text);

  }

}
