package com.simplilearn.accessModifiers;

import com.simplilearn.utils.UtilsDemo;

public class PublicAccessModifiersDemo {
  public static void main(String[] args) {

    UtilsDemo utilsDemo = new UtilsDemo();

    // Class Initialization
    Father father = new Father();
    System.out.println("The amount :: " + father.amount);
    System.out.println("The park :: " + father.park);

    utilsDemo.printDL();

    System.out.println("The amount : " + father.showAmount());
    System.out.println("The park : " + father.displayPark());
  }
}

class Father {

  // Public Members
  public double amount = 345464.43d;
  public String park = "Public Health Park";

  // Public Methods
  public double showAmount() {
    return amount;
  }

  public String displayPark() {
    return park;
  }

  // Public Constructor
  public Father() {
  }
}