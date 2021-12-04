package com.simplilearn.accessModifiersB;

public class SuperHero {
  protected String power = "Healing Super Power!";

  // protected methods
  protected void usePower() {
    System.out.println("The Best power is " + power);
  }

  // public method
  public String showPower() {
    return power;
  }

  public SuperHero() {
  }
}
