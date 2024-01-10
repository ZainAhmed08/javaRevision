package com.java8features.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//problem statement :
//Problem 2: Mapping and Summing
//Given a list of employees with salary information, find the total salary of all employees.
class Employe{
    int id;
    int salary;

    public Employe(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
}
public class Problem_2_Mapping_and_Summing {
    public static void main(String[] args) {
        List<Employe> employesList = new ArrayList<>();
        employesList.add(new Employe(1,10000));
        employesList.add(new Employe(2,30000));
        employesList.add(new Employe(4,50000));
        employesList.add(new Employe(5,12000));
        employesList.add(new Employe(3,32000));
        int count = 0;
        int total = employesList.stream().map(Employe::getSalary).mapToInt(Integer::intValue).sum();
        System.out.println(total);
    }
}
