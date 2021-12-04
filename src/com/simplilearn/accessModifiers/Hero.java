package com.simplilearn.accessModifiers;

public class Hero {
  // Protected Properties
  protected String power = "Healing Power!";

  // Protected Methods
  protected void usePower() {
    System.out.println("The Best power is " + power);
  }

  // Public Method
  public String showPower() {
    return power;
  }

  protected Hero() {
  }
}
