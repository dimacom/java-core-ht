package ht12streamapi;

import java.util.List;
import java.util.Optional;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.*;

public class Task7 {
    public static void main(String[] args) {
        List<Person> youngerPerson = getPerson(personList, getEmployee(personList), getStudent(personList));
        Optional<Person> min = youngerPerson.stream()
                .min((o1, o2) -> (int) o2.getBirthday().toEpochDay() - (int) o1.getBirthday().toEpochDay());
        Person younger = min.orElseThrow(IllegalStateException::new);
        System.out.println(younger);
    }
}
