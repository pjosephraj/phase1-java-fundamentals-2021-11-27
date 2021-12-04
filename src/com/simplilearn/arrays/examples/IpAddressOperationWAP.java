package com.simplilearn.arrays.examples;

import java.util.Scanner;

import com.simplilearn.utils.UtilsDemo;

public class IpAddressOperationWAP {

  private static Scanner input;
  static String[] ips = { "192.168.0.1", "192.168.0.2", "192.168.0.3", "192.168.0.4", "192.168.0.5" };
  static Byte[] status = { 0, 1, 0, 0, 1 };
  static boolean ipNotExist = true;

  public static void main(String[] args) {

    input = new Scanner(System.in);
    UtilsDemo.printDL();

    UtilsDemo.printDL();

    while (ipNotExist) {
      System.out.println(":: Enter the IP Address to check it's status ::");
      String ipAddress = (String) input.next();
      ipNotExist = findIpAddress(ipAddress);
    }

  }

  private static boolean findIpAddress(String ipAddress) {
    boolean notExist = true;
    for (int index = 0; index < ips.length; index++) {
      if (ipAddress.matches(ips[index])) {
        UtilsDemo.printDL();
        String ipStatus = status[index] == 0 ? "InActive" : "Active";
        System.out.println("The status of the IP Address " + ipAddress + " => " + ipStatus);
        notExist = false;
      }
    }
    if (notExist) {
      System.out.println("The IP Address entered is not found!");
    }
    return notExist;
  }
}
