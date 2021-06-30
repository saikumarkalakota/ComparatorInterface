package com.company;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    int employeeId;
    String firstName;
    String lastName;
    String department;

    public Employee(int employeeId, String firstName, String lastName, String department) {
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
    @Override
    public Comparator<Employee> reversed() {
        return null;
    }
}
