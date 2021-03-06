package com.simplilearn.typecasting;

import java.util.Scanner;

import com.simplilearn.utils.UtilsDemo;

public class NumericDataCnverter {

	private static Scanner input;

	public static void main(String[] args) {
		// Step 1: Collect input number value from user.
		
		input = new Scanner(System.in);
		
		UtilsDemo.printDL();
		
		int userInput = input.nextInt();
		
		// Step 2: Convert number into other types
		// implicit type
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// Explicit type
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;
		
		UtilsDemo.printDL();
		
		System.out.println("Byte Value: " + byteValue);
		System.out.println("Short Value: " + shortValue);
		System.out.println("Long Value: " + bigValue);
		System.out.println("Float Value: " + floatValue);
		System.out.println("Double Value: " + doubleValue);
		

	}

}
