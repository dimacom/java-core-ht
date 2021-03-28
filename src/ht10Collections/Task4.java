package ht10Collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;


public class Task4 {
    public static void main(String[] args) {
        LocalDate currentDay;
        Map<LocalDate, String> people = new HashMap<>();
        people.put(LocalDate.of(2010, 8, 10), "Ivanov");
        people.put(LocalDate.of(2011, 9, 12), "Polianskiy");
        people.put(LocalDate.of(2011, 10, 1), "Bukas");
        people.put(LocalDate.of(2011, 1, 3), "Shibeko");
        people.put(LocalDate.of(2010, 3, 17), "Smirnov");
        people.put(LocalDate.of(2010, 5, 30), "Horoshih");
        people.put(LocalDate.of(2011, 7, 25), "Milay");
        people.put(LocalDate.of(2011, 12, 12), "Smirnov");
        people.put(LocalDate.of(2011, 6, 27), "Belovskiy");
        people.put(LocalDate.of(2010, 4, 6), "Kupreev");
        System.out.println(people.toString());

        people.entrySet().removeIf(entry -> entry.getKey().getMonthValue() > 5 && entry.getKey().getMonthValue() < 9);
        System.out.println(people.toString());


    }


}


