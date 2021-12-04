package com.simplilearn.methods.employee;

import com.simplilearn.utils.UtilsDemo;

public class TestWAP {

  public static void main(String[] args) {
    
    // Create Employee
    Employee ajithKumar = new Employee(1001, "Ajith Kumar", 50000);
    Employee aamirKhan = new Employee(1002, "Aamir Khan", 60000);

    // Initialize Employee Operation
    EmployeeOperation operation = new EmployeeOperation();

    
    // Employee operation methods
    UtilsDemo.printDL();
    operation.showSalary(ajithKumar);
    operation.salaryIncrement(ajithKumar, 15000);
    operation.salaryDecrement(ajithKumar, 10000);
    operation.salaryIncrement(ajithKumar, 20000);

    UtilsDemo.printDL();
    operation.showSalary(aamirKhan);
    operation.salaryIncrement(aamirKhan, 25000);
    operation.salaryDecrement(aamirKhan, 15000);
    operation.salaryIncrement(aamirKhan, 30000);
  }
  
}
