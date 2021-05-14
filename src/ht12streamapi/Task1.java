package ht12streamapi;

import java.util.List;

import static ht12streamapi.Utils.*;

public class Task1 {
    static List<Person> personList = getPerson(listByCSV());

    public static void main(String[] args) {
        List<Student> students = getStudent(personList);
        System.out.println(students);
    }
}