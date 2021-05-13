package ht12streamapi;

import java.time.LocalDate;
import java.util.List;

import static ht12streamapi.Task1.personList;
import static ht12streamapi.Utils.getStudent;

public class Task3 {
    public static void main(String[] args) {
        List<Student> students = getStudent(personList, x -> x.getCourse() > 3 && LocalDate.now().getYear() - x.getBirthday().getYear() > 22);
        System.out.println(students);
    }
}
