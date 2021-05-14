package ht12streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.*;

public class Task10 {
    public static void main(String[] args) {
        final List<Person> person = getPerson(personList, getEmployee(personList), getStudent(personList));
        Map<String, List<String>> personMap = person.stream()
                .collect(Collectors.toMap(Person::getLastName,
                        p -> person.stream()
                                .filter(person1 -> person1.getLastName().equals(p.getLastName()))
                                .map(Person::getFirstName)
                                .collect(Collectors.toList()),
                        (lastName1, lastName2) -> lastName1));
        System.out.println(personMap);
    }


}
