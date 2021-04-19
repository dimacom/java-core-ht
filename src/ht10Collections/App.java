package ht10Collections;

import ht10Collections.person.Person;
import ht10Collections.person.Season;

import java.util.*;

import static ht10Collections.Task4.peopleBirthdayWithoutSeason;
import static ht10Collections.Task5.deletePersonDuplicateName;
import static ht10Collections.Task6.deletePeopleIfLittleSalary;
import static ht10Collections.Task3.findPeople;
import static ht10Collections.person.Season.SUMMER;
import static java.time.LocalDate.of;

public class App {
    public static void main(String[] args) {
        Map<Integer, Person> people = new HashMap<>();
        people.put(Person.id, new Person("Randolf", "Cancellario", of(2010, 1, 3), 300));
        people.put(Person.id, new Person("Karl", "Woodburn", of(2011, 12, 30), 550));
        people.put(Person.id, new Person("Cherry", "Kelshaw", of(2010, 4, 20), 700));
        people.put(Person.id, new Person("Binnie", "Bogeys", of(2010, 8, 17), 600));
        people.put(Person.id, new Person("Denys", "Terese", of(2011, 11, 22), 450));
        people.put(Person.id, new Person("Caddric", "Jonathon", of(2010, 2, 4), 690));
        people.put(Person.id, new Person("Georas", "MacIlurick", of(2010, 3, 11), 370));
        people.put(Person.id, new Person("Jodie", "Fawlo", of(2010, 5, 7), 1100));
        people.put(Person.id, new Person("Dall", "Woodburn", of(2011, 6, 28), 870));
        people.put(Person.id, new Person("Cherry", "Milvarnie", of(2010, 5, 30), 350));

        findPeople("Woodburn", people);  //Task3
        findPeople("Kelshaw", "Dall", people);  //Task3

        peopleBirthdayWithoutSeason(SUMMER, people); //Task4

        deletePersonDuplicateName(people);  //Task5

        deletePeopleIfLittleSalary(people);  //Task6
    }
}
