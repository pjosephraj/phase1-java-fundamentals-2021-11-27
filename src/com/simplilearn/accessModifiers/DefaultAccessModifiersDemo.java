package com.simplilearn.accessModifiers;

public class DefaultAccessModifiersDemo {
  public static void main(String[] args) {

    Brother brother = new Brother();

    System.out.println("The Brother Money: " + brother.money);
    System.out.println("The Brother shoes: " + brother.shoes);
    brother.showAll();
  }

}

class Brother {

  // Default Properties
  double money = 3454576;
  String shoes = "XYZ";

  // Default Method
  void showAll() {
    System.out.println("The Money :: " + money + " Shoes :: " + shoes);
  }

  // Default Constructor
  Brother() {
  }

}