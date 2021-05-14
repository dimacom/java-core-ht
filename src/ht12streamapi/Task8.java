package ht12streamapi;

import java.util.List;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.*;

public class Task8 {
    public static void main(String[] args) {
        List<Person> persons = getPerson(personList, getEmployee(personList), getStudent(personList));
        Integer sumAge = persons.stream()
                .map(x -> x.getBirthday().getYear())
                .reduce(0, (age1, age2) -> age1 + age2);
        System.out.println(sumAge);
    }
}
