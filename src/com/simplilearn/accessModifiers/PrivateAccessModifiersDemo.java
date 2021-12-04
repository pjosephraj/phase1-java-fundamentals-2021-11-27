package com.simplilearn.accessModifiers;

public class PrivateAccessModifiersDemo {
  public static void main(String[] args) {

    // Class Initialization
    Account account = new Account();

    // Private Members
    // Account.balance is not accessible here
    // account.balance; 
    // Account.password is not accessible here
    // account.password;

    // Private Methods
    // The method showPass() is not accessible here
    // account.showPass(); 
    // The method showUsername() is not accessible here
    // account.showUsername(); 

    // Public Method can be accessible here
    account.showId();
    account.showBalance();
  }
}

class Account {
	
	// data members 
	private long id = 123234545;
	private double balance = 656344;
	private String username ="mike12K";
	private String password ="mik@#!%";
	
	//private methods
	private String showUsername() {
		return username;
	}
	
	private String showPass() {
		return password;
	}
	
	public void showId() {
		System.out.println("User Id : "+id);
	}

  public void showBalance() {
    System.out.println("Account Balance: " + balance);
  }
	
	Account() {}
	// private constructor
	// Note : Private Constructor based class can not be instantiated.
	// private Account() {}
	
}
