package com.torryharris.driver;

import java.util.Scanner;

public class Employee {
    String EmployeeName;
    int EmployeeAge;
    int EmployeeId;

    public Employee() {
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public int getEmployeeAge() {
        return EmployeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        EmployeeAge = employeeAge;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public Employee(String employeeName, int employeeAge, int employeeId) {
        EmployeeName = employeeName;
        EmployeeAge = employeeAge;
        EmployeeId = employeeId;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee emp=new Employee();
        System.out.println("Enter employee name");
        emp.setEmployeeName(s.nextLine());
        System.out.println("Enter employee age");
        emp.setEmployeeAge(s.nextInt());
        System.out.println("Enter employee Id");
        emp.setEmployeeId(s.nextInt());
        System.out.println("Employee name is "+emp.getEmployeeName());
        System.out.println("Employee age is "+emp.getEmployeeAge());
        System.out.println("Employee id is "+emp.getEmployeeId());
    }
}
