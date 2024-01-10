package com.java8features.streamAPI;

import java.util.ArrayList;
import java.util.List;

//Problem 4: GroupingBy
//Given a list of employees, group them by their department.
class Employee{
    int empId;
    String department;
    public Employee(int empId , String department){
        this.empId      = empId;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
public class Problem_4_GroupingBy {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"IT"));
        employeeList.add(new Employee(2,"Acounting"));
        employeeList.add(new Employee(3,"IT"));

    }
}
