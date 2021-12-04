package com.simplilearn.methods;

import com.simplilearn.utils.UtilsDemo;

public class MethodDemo {

  public static void main(String[] args) {
    // Method calling

    MethodDemo md = new MethodDemo();
    md.showMessage();
    md.displayAuthor("John Smith");
    md.displayDetails("John@gmail.com", "Book Author");

    UtilsDemo.printDL();

    Employee emp = new Employee(10001, 3274979.5, "John Smith");
    md.showEmployee(emp);
  }

  public void showMessage() {
    System.out.println(" :: Welcome to Java Methods ::");
  }

  public void displayAuthor(String name) {
    System.out.println(" :: @Author :: " + name);
  }

  public void displayDetails(String email, String description) {
    System.out.println(" :: @Details/email :: " + email);
    System.out.println(" :: @Details/description :: " + description);
  }

  public void showEmployee(Employee emp) {
    System.out.println(" :: Employee/id :: " + emp.id);
    System.out.println(" :: Employee/name :: " + emp.name);
    System.out.println(" :: Employee/salary :: " + emp.salary);
  }

}

class Employee {
  public int id;
  public double salary;
  public String name;

  Employee(int id, double salary, String name) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
}
