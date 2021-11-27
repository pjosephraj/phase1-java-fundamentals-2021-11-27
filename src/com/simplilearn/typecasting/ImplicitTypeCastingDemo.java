package com.simplilearn.typecasting;

public class ImplicitTypeCastingDemo {

	public static void main(String[] args) {
		/** Implicit TypeCase: When datatype are compatible, automatically type cast
		 * Widening Type Cast: Converts data from lower range value to higher range type.
		 * byte -> short -> int -> long -> float -> double
		 */
		
		byte smallCount = 100; // -128 to 127 => 1 byte = 8bit
		
		short shortCount = smallCount; // Widening -> byte -> short
		
		int intCount = smallCount; // Widening -> byte => int

		long bigCount = intCount; // widening -> int => long
		
		float floatCount = bigCount; // Widening -> long => float 
		
		double decimalCount = bigCount; // Widening -> long => double
		
		System.out.println("Byte Count: " + smallCount);
		System.out.println("Short Count" + shortCount);
		System.out.println("Int Count" + intCount);
		System.out.println("Big Count" + bigCount);
		System.out.println("Float Count" + floatCount );
		System.out.println("Decimal Count" + decimalCount );
		
	}

}
