package com.simplilearn.arrays;

public class UserNameArraysWAP {

  public static void main(String[] args) {

    String[] firstNames = { "John", "Mike", "David" };
    String[] lastNames = { "Doe", "Tyson", "Warner" };

    for (int index = 0; index < firstNames.length; index++) {
      System.out.println("First Name: " + firstNames[index] + " | Last Name: " + lastNames[index]);
    }

  }

}
