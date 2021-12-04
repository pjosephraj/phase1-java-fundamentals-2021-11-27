package com.simplilearn.arrays;

import java.util.Arrays;

import com.simplilearn.utils.UtilsDemo;

public class ArrayMultidimensionalDemo {
  public static void main(String[] args) {
		// Two Dimensional Array
		int[][] numbers = { {2,4,6,8,10} , {3,5,9,11,13} };
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		
		UtilsDemo.printDL();

		for (int row = 0; row < numbers.length; row++) {
			System.out.println(Arrays.toString(numbers[row]));
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.println("["+ row +", "+col + "] => "+numbers[row][col]);
			}
		}
	}
  
}
