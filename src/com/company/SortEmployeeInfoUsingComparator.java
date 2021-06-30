package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeInfoUsingComparator {

    public static void main(String[] args) {
	// write your code here


        Employee employee1= new Employee(1001, "John", "Gresham", "Accounts");
        Employee employee2= new Employee(1002, "Sam", "Grace", "Finance");
        Employee employee3= new Employee(1003, "King", "Milton", "IT");
        Employee employee4= new Employee(1004, "Alex", "Hilton", "Admin");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        System.out.println("Employee list as per Insertion order");

        for(Employee employee: employeeList)
            System.out.println(employee);
//Comparator interface reference created. Using method reference (Class::Getter)
        Comparator<Employee> comparatorFirstName= Comparator.comparing(Employee::getFirstName);
        employeeList.sort(comparatorFirstName);

        System.out.println("Employee list after sorting using first name");

        for(Employee employee: employeeList)
            System.out.println(employee);

        Comparator<Employee> comparatorLastName= Comparator.comparing(x-> x.getLastName());
        employeeList.sort(comparatorLastName);

        System.out.println("Employee list after sorting using last name");

        for(Employee employee: employeeList)
            System.out.println(employee);

        Comparator<Employee> comparatorDepartment= Comparator.comparing(e-> e.getDepartment());
        employeeList.sort(comparatorDepartment);

        System.out.println("Employee list after sorting using Department");

        for(Employee employee: employeeList)
            System.out.println(employee);

        Comparator<Employee> comparatorEmployeeId= Comparator.comparing(e->e.employeeId);

        employeeList.sort(comparatorEmployeeId.reversed());

        System.out.println("Employee list after sorting using Employee Id reverse order");

        for(Employee employee: employeeList)
            System.out.println(employee);




    }
}
