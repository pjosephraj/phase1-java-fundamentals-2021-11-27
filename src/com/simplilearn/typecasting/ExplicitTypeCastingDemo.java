package com.simplilearn.typecasting;

public class ExplicitTypeCastingDemo {

	public static void main(String[] args) {
		// Explicit type CastL When type are not compatible, does not happen automatically
		/**
		 * Narrowing: Converts data of incompatible type
		 * Convert data from higher range value to lower range value.
		 * double => float => long => int => short => byte.
		 */
		
		double price = 122.334d;
		
		long bigPrice = (long) price; // Narrowing -> double => long
		
		int intPrice = (int) price; // Narrowing -> double => int
		
		short shortPrice = (short) bigPrice; // Narrowing -> long => short
		
		byte bytePrice = (byte) price; // Narrowing -> double => byte
		
		System.out.println("Double price: " + price);
		System.out.println("Big price: " + bigPrice);
		System.out.println("Int price: " + intPrice);
		System.out.println("Short price: " + shortPrice);
		System.out.println("Byte  price: " + bytePrice);

	}

}
