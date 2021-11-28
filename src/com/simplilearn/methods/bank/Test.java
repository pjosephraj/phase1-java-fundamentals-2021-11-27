package com.simplilearn.methods.bank;

public class Test {
  public static void main(String[] args) {
    // Create Account object
    Account account = new Account(100011, "John Snow", "Iron Bank", 50000.00);

    // Create Bank account Object
    BankOperation operation = new BankOperation();

    operation.showBalance(account);
    operation.withdrawAmount(account, 500);
    operation.withdrawAmount(account, 5000000);
    operation.depositAmount(account, 1500);
  }
}
