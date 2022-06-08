package com.company;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {

    private static final Map<Integer, Employee> employees = new HashMap<>();


    public void addEmployee(Employee employee) {
        if(employees.containsKey(employee.getId()))
        employees.put(employee.getId(), employee);
    }

    public void removeEmployee(Employee employee) {
        if(employees.containsKey(employee.getId()))
        employees.remove(employee.getId(), employee);
    }

    public String getEmployee(Integer id) {
        final Employee employee = employees.get(id);
        return employee.toString();
    }


    public double salarySum(Employee employee) {
        double sum = 0;
        if (employees.containsKey(employee.getId())) {
            sum += employee.getWorkersSalary();
        }
        return sum;
    }

    public String totalSum(Employee employees) {
        return  "Общие затраты на зарплату в месяц составляют " + salarySum(employees) + " рублей.";
    }

    public void maxSalary(Employee[] employees) {
        Employee maxValue = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWorkersSalary() > maxValue.getWorkersSalary()) {
                maxValue = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + maxValue.getWorkersSalary() + " рублей: " + "ID № " + maxValue.getId() + " " + maxValue.getWorkerName() + " из отдела № " + maxValue.getDepartment());
    }

    public void minSalary(Employee[] employees) {
        Employee minValue = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWorkersSalary() < minValue.getWorkersSalary()) {
                minValue = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + minValue.getWorkersSalary() + " рублей: " + "ID № " + minValue.getId() + " " + minValue.getWorkerName() + " из отдела № " + minValue.getDepartment());
    }

//    public void averageSalary(Employee employees) {
//        double average = salarySum(employees) / employees.length;
//        System.out.println("Среднаяя зарплата сотрудников составляет " + average + " рублей.");
//    }



    public void upSalary(Employee[] salaryPercent, int percent) {
        System.out.println("Зарплата сотрудников после индексации стала: ");
        for (Employee percents : salaryPercent) {
            double salaryAfter = (percents.getWorkersSalary() * percent / 100) + percents.getWorkersSalary();
            percents.setWorkersSalary(salaryAfter);
            System.out.println("ID № " + percents.getId() + " " + percents.getWorkerName() + " " + percents.getDepartment() + " " + salaryAfter);
        }
    }

    public void departmentMinSalary(Employee[] department, int dep) {
        Employee minSalary = null;
        double minSalaryValue = Integer.MAX_VALUE;
        for (int i = 1; i < department.length; i++) {
            if (department[i].getDepartment() == dep && department[i].getWorkersSalary() < minSalaryValue) {
                minSalary = department[i];
                minSalaryValue = department[i].getWorkersSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + minSalary.getWorkersSalary() + " рублей: " + "ID № " + minSalary.getId() + " " + minSalary.getWorkerName());
    }


    public void departmentMaxSalary(Employee[] department, int dep) {
        Employee maxSalary = null;
        double maxSalaryValue = Integer.MIN_VALUE;
        for (int i = 1; i < department.length; i++) {
            if (department[i].getDepartment() == dep && department[i].getWorkersSalary() > maxSalaryValue) {
                maxSalary = department[i];
                maxSalaryValue = department[i].getWorkersSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalary.getWorkersSalary() + " рублей: " + "ID № " + maxSalary.getId() + " " + maxSalary.getWorkerName());
    }

    public double departmentSalarySum(Employee[] department, int dep) {
        double sum = 0;
        for (Employee employee : department) {
            if (employee.getDepartment() == dep) {
                sum += employee.getWorkersSalary();
            }
        }
        return sum;
    }

    public void departmentTotalSalary(Employee[] employees) {
        System.out.println("Общая сумма зарплат по отделу составляют: " + departmentSalarySum(employees, 3) + " рублей.");
    }

    public void departmentAverage(Employee[] department, int dep) {
        int num = 0;
        double average;
        for (Employee employee : department) {
            if (employee.getDepartment() == dep) {
                num++;
            }
        }
        average = departmentSalarySum(department, 3) / num;
        System.out.println("Средняя зарплата по отделу составляет: " + average);
    }

    public void departmentUpSalary(Employee[] department, int dep, int percent) {
        System.out.println("Зарплата сотрудников после индексации стала: ");
        for (Employee percents : department) {
            if (percents.getDepartment() == dep) {
                double departmentSalaryAfter = (percents.getWorkersSalary() * percent / 100) + percents.getWorkersSalary();
                percents.setWorkersSalary(departmentSalaryAfter);
                System.out.println("ID № " + percents.getId() + " " + percents.getWorkerName() + " " + percents.getDepartment() + " " + departmentSalaryAfter);
            }
        }
    }


    public void employeesDepartment(Employee[] department, int dep) {
        for (int i = 0; i < department.length; i++) {
            if (department[i].getDepartment() == dep)
                System.out.println("ID № " + department[i].getId() + " " + department[i].getWorkerName() + " " + department[i].getWorkersSalary());
        }
    }


    public void lessNumber(Employee[] num, int number) {
        for (Employee employee : num) {
            if (employee.getWorkersSalary() < number) {
                System.out.println("ID № " + employee.getId() + " " + employee.getWorkerName() + " " + employee.getWorkersSalary());
            }
        }
    }

    public void moreNumber(Employee[] num, int number) {
        for (Employee employee : num) {
            if (employee.getWorkersSalary() >= number) {
                System.out.println("ID № " + employee.getId() + " " + employee.getWorkerName() + " " + employee.getWorkersSalary());
            }
        }
    }
}
