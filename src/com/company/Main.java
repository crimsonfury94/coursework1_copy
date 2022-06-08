package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employees = new EmployeeBook(Map.of(
                1,
                new Employee(
                        "Бусина Валентина Юрьевна",
                        3,
                        25000
                ),
                2,
                new Employee(
                        "Семенов Степан Олегович",
                        2,
                        27000
                ),
                3,
                new Employee(
                        "Дарницкий Петр Семенович",
                        3,
                        29000
                ),
                4,
                new Employee(
                        "Петров Александр Валентинович",
                        4,
                        22000
                ),
                5,
                new Employee(
                        "Евстегнеев Станислав Петрович",
                        5,
                        21000
                ),
                6,
                new Employee(
                        "Шляпин Егор Владимирович",
                        4,
                        23000
                ),
                7,
                new Employee(
                        "Сырков Велерий Федорович",
                        3,
                        24000
                ),
                8,
                new Employee(
                        "Шарикова Елена Павловна",
                        2,
                        28000
                ),
                9,
                new Employee(
                        "Кысь Юлия Петровна",
                        1,
                        30000
                ),
                10,
                new Employee(
                        "Кошкина Валерия Дмитриевна",
                        5,
                        45000
                )
        ));

        employees.addEmployee(new Employee("Кошкина Валерия Дмитриевна",
                5,
                45000));
        employees.getEmployee(5);
    }
}
