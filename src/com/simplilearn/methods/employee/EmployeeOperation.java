package com.simplilearn.methods.employee;

public class EmployeeOperation {

  // Show Salary
  public double showSalary(Employee employee) {
    System.out.println("The Employee " + employee.empName + ", salary is " + employee.empSalary);
    return employee.empSalary;
  }

  public double salaryIncrement(Employee employee, double amount) {
    if (amount > 0) {
      employee.empSalary += amount;
      System.out.println("The Employee " + employee.empName + ", salary is " + employee.empSalary);
      return employee.empSalary;
    } else {
      System.out.println("Invalid Increment amount!");
      return 0;
    }
  }

  public double salaryDecrement(Employee employee, double amount) {
    if (amount > 0) {
      employee.empSalary -= amount;
      System.out.println("The Employee " + employee.empName + ", salary is " + employee.empSalary);
      return employee.empSalary;
    } else {
      System.out.println("Invalid Increment amount!");
      return 0;
    }
  }

}
