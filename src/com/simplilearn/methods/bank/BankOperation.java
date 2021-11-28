package com.simplilearn.methods.bank;

public class BankOperation {
  
  // Show Balance
  public double showBalance (Account account) {
    System.out.println("The account: "+ account.accNo + " has Balance: " + account.balance);
    return account.balance;
  }

  // Withdraw Operation
  public double withdrawAmount (Account account, double amount) {
    if(amount > 0 && amount < account.balance) {
      account.balance -= amount;
      System.out.println("The account: "+ account.accNo + " has Balance: " + account.balance);
      return account.balance; 
    } else {
      System.out.println("Invalid withdraw amount! ");
      return 0;
    }
  }

  // Deposit Operation
  public double depositAmount (Account account, double amount) {
    if(amount > 0) {
      account.balance += amount;
      System.out.println("The account: "+ account.accNo + " has Balance: " + account.balance);
      return account.balance; 
    } else {
      System.out.println("Invalid Deposit amount! ");
      return 0;
    }
  }

  // FD Operation
}
