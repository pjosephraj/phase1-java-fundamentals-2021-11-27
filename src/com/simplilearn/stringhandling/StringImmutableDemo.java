package com.simplilearn.stringhandling;

public class StringImmutableDemo {

  public static void main(String[] args) {

    // In Java, String objects are immutable.
    // Immutable simply means unmodifiable or unchangeable values.
    String username = "John";

    // Concat -> Updating a string
    String response = username.concat(" Snow");

    System.out.println(username); // -> Old string
    System.out.println(response); // -> New string

  }

}
