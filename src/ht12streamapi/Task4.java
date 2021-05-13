package ht12streamapi;

import java.util.List;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.getEmployee;

public class Task4 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee(personList, x ->
                (x.getSalary().doubleValue() > 1000 && x.getSalary().doubleValue() < 1500)
                        && (x.getPosition().equals(Positions.ENGINEER) || x.getPosition().equals(Positions.LABORATORY_ASSISTANT))
                        && (x.getBirthday().getMonthValue() == 01));
        System.out.println(employees);

    }
}
