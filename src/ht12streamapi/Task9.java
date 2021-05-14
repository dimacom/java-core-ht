package ht12streamapi;

import java.util.List;
import java.util.stream.Collectors;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.*;

public class Task9 {
    public static void main(String[] args) {
        List<Person> person = getPerson(personList, getEmployee(personList), getStudent(personList));
        List<String> lastName = person.stream()
                .map(Person::getLastName)
                .collect(Collectors.toList());
        System.out.println(lastName);
    }
}
