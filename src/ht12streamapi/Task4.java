package ht12streamapi;

import java.util.List;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.getEmployee;

public class Task4 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee(personList,
                employee -> (employee.getSalary().doubleValue() > 1000
                        && employee.getSalary().doubleValue() < 1500)
                        && (employee.getPosition().equals(Positions.ENGINEER)
                        || employee.getPosition().equals(Positions.LABORATORY_ASSISTANT))
                        && (employee.getBirthday().getMonthValue() == 01));
        System.out.println(employees);

    }
}
