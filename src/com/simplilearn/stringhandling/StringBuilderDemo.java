package com.simplilearn.stringhandling;

import com.simplilearn.utils.UtilsDemo;

public class StringBuilderDemo {
  
  public static void main(String[] args) {
		
		StringBuilder message = new StringBuilder("Today is a wonderfull day!");
		System.out.println(message);
    UtilsDemo.printDL();
		
		// String Modification
		// String Append
		message.append(" Happy learning!");
		System.out.println(message);
    UtilsDemo.printDL();
		
		// Replace String
		message.replace(0, 1, "t" );
		System.out.println(message);
    UtilsDemo.printDL();
		
		// Delete String
		message.delete(0, 2);
		System.out.println(message);
    UtilsDemo.printDL();
		
		// Insert String
		message.insert(0, "Welcome, ");
		System.out.println(message);
		
	}

}
