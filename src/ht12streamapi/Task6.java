package ht12streamapi;

import java.util.List;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.getEmployee;

public class Task6 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee(personList);
        double johnSumSalary = employees.stream()
                .filter(employee -> employee.getFirstName().equals("John"))
                .peek(System.out::println)
                .mapToDouble(employee -> employee.getSalary().doubleValue()).sum();
        System.out.println(johnSumSalary);
    }
}
