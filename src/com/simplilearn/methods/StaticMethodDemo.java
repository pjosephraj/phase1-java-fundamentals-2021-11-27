package com.simplilearn.methods;

public class StaticMethodDemo {
  // Method calling

  public static void main(String[] args) {
    StaticMethodDemo.showMessage();
    StaticMethodDemo.displayAuthor("John Smith");
    StaticMethodDemo.displayDetails("John@gmail.com","Book Author");

    System.out.println("----------------------------");

    Employee emp = new Employee(1001, 5000.00, "John Smith");
    StaticMethodDemo.showEmployee(emp);
  }

  public static void showMessage() {
    System.out.println(" :: Welcome to Java Methods ::");
  }

  public static void displayAuthor(String name) {
    System.out.println(" :: @Author :: " + name);
  }

  public static void displayDetails(String email, String description) {
    System.out.println(" :: @Details/email :: " + email);
    System.out.println(" :: @Details/description :: " + description);
  }

  public static void showEmployee(Employee emp) {
    System.out.println(" :: Employee/id :: " + emp.id);
    System.out.println(" :: Employee/name :: " + emp.name);
    System.out.println(" :: Employee/salary :: " + emp.salary);
  }

}
