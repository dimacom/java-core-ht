package ht12streamapi;

import java.util.HashSet;
import java.util.List;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.getEmployee;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee(personList);
        HashSet<Employee> uniqueEmployees = new HashSet<>(employees);
        System.out.println(uniqueEmployees);
    }
}
