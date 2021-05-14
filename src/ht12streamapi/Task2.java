package ht12streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.getEmployee;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee(personList);
        Set<Employee> unique = new HashSet<>(employees);
        System.out.println(unique);

    }
}
