package com.simplilearn.accessModifiers;

import com.simplilearn.accessModifiersB.SuperHero;
import com.simplilearn.utils.UtilsDemo;

public class ProtectedAccessModifiersDemo extends SuperHero {
  public static void main(String[] args) {

    UtilsDemo utils = new UtilsDemo();

    // Same package class
    Hero hero = new Hero();
    System.out.println("The Power: " + hero.power);
    System.out.println("The Power: " + hero.showPower());
    hero.usePower();

    utils.printDL();

    // Outside package class
    SuperHero hero2 = new SuperHero();
    // power method not accessible
    // hero2.power; 
    // usePower method not accessible
    // hero2.usePower(); 
    hero2.showPower();

    utils.printDL();

    // Protected properties and method with inheritance (extended SuperHero class).
    ProtectedAccessModifiersDemo pamd = new ProtectedAccessModifiersDemo();
    System.out.println("The Power: " + pamd.power);
    System.out.println("The Power: " + pamd.showPower());
    pamd.usePower();
  }
}
