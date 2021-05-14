package ht12streamapi;

import java.util.List;
import java.util.Optional;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.getEmployee;

public class Task5 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee(personList);
        Optional<Employee> max = employees.stream()
                .max(Employee::compareTo);
        Employee employeeMaxSalary = max.orElseThrow(IllegalStateException::new);
        System.out.println(employeeMaxSalary);
    }
}
