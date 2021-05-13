package ht12streamapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Utils {
    static Random rnd = new Random();

    static List<String> listByCSV() {
        List<String> list = new ArrayList<>();
        final String fileName = "C:/Users/User/IdeaProjects/java-ht/src/main/resources/person.csv";
        try (final BufferedReader rdr = new BufferedReader(new FileReader(fileName))) {
            String line;
            rdr.readLine();
            while ((line = rdr.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    static List<Person> getPerson(List<String> list) {
        List<Person> people = new ArrayList<>();
        for (String s : list) {
            String[] split = s.split(",");
            people.add(new Person(split[0], split[1], LocalDate.parse(split[2])));
        }
        return people;
    }

    static  List<Person> getPerson(List<Person> person, Predicate<Person> predicate){
      return   person.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
    static List<Student> getStudent(List<Person> personList) {
        return personList.stream()
                .map(x -> new Student(x.getLastName(), x.getFirstName(), x.getBirthday(), String.valueOf(112000 + rnd.nextInt(4)), rnd.nextInt(5)))
                .collect(Collectors.toList());
    }

    static List<Student> getStudent(List<Person> personList, Predicate<Student> predicate) {
        Random rnd = new Random();
        return personList.stream()
                .map(x -> new Student(x.getLastName(), x.getFirstName(), x.getBirthday(), String.valueOf(112000 + rnd.nextInt(4)), rnd.nextInt(5)))
                .filter(predicate)
                .collect(Collectors.toList());
    }

    static List<Employee> getEmployee(List<Person> personList) {
        String[] positions = {"ENGINEER", "ELECTRICIAN", "MECHANIC", "LABORATORY_ASSISTANT"};
        return personList.stream()
                .map(x -> new Employee(x.getFirstName(), x.getLastName(), x.getBirthday(), BigDecimal.valueOf(rnd.nextDouble() * 4000), Positions.valueOf(positions[rnd.nextInt(4)])))
                .collect(Collectors.toList());
    }
    static List<Employee> getEmployee(List<Person> personList, Predicate<Employee>predicate) {
        String[] positions = {"ENGINEER", "ELECTRICIAN", "MECHANIC", "LABORATORY_ASSISTANT"};
        return personList.stream()
                .map(x -> new Employee(x.getFirstName(), x.getLastName(), x.getBirthday(), BigDecimal.valueOf(rnd.nextDouble() * 4000), Positions.valueOf(positions[rnd.nextInt(4)])))
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
