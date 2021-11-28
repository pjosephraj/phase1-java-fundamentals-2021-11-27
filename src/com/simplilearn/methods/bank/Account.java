package com.simplilearn.methods.bank;

public class Account {

  // Data members
  public long accNo;
  public String username;
  public String bankName;
  public double balance;

  // Constructor 1) Non Paramaterized 2) Paramaterized

  // Zero Argument / Non Paramaterized constructor
  Account() {}

  // one parameter Constructor
  Account(long accNo) {
    this.accNo = accNo;
  }

  // Two parameters Constructor
  Account(long accNo, String userName) {
    this.accNo = accNo;
    this.username = userName;
  }

  // Multi parameters Constructor
  Account(long accNo, String userName, String bankName, double balance) {
    this.accNo = accNo;
    this.username = userName;
    this.bankName = bankName;
    this.balance = balance;
  }
}
