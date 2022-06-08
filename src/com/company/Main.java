package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.removeEmployee(10);
        employeeBook.addEmployee(10, new Employee("Мышь Олег", 5, 15000));
        employeeBook.getEmployee(10);
    }
}
