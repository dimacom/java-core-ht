package ht10Collections;

import ht10Collections.person.Person;
import ht10Collections.person.Season;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static Map<Integer, Person> peopleBirthdayWithoutSeason(Season withoutSeason, Map<Integer, Person> people) {
        System.out.println("people who have birthday without " + withoutSeason.name());
        Map<Integer, Person> peopleBirthday = new HashMap<>();
        String[] months = withoutSeason.season.split("\\D+");
        for (Person person : people.values()) {
            int counter = 0;
            for (String month : months) {
                if (!month.equals(String.valueOf(person.getBirthday().getMonthValue()))) {
                    ++counter;
                    if (counter == 3) peopleBirthday.put(person.getIdPerson(), person);
                }
            }
        }
        for (Person value : peopleBirthday.values()) {
            System.out.println(value.toString());
        }
        return peopleBirthday;
    }
}


