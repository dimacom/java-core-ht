package ht10Collections;

import ht10Collections.person.Person;

import java.util.HashMap;
import java.util.Map;

import static ht10Collections.person.Season.SUMMER;
import static ht10Collections.Task3.findPeople;
import static ht10Collections.Task4.peopleBirthdayWithoutSeason;
import static java.time.LocalDate.of;

public class App {
    public static void main(String[] args) {
        Map<Integer, Person> people = new HashMap<>();
        people.put(Person.id ,new Person("Cherry","Cancellario", of(2010, 1, 3)));
        people.put(Person.id ,new Person("Jodie","Woodburn", of(2011, 12, 30)));
        people.put(Person.id ,new Person("Randolf","Kelshaw", of(2010, 4, 20)));
        people.put(Person.id ,new Person("Binnie","Bogeys", of(2010, 8, 17)));
        people.put(Person.id ,new Person("Denys","Terese", of(2011, 11, 22)));
        people.put(Person.id ,new Person("Caddric","Jonathon", of(2010, 2, 4)));
        people.put(Person.id ,new Person("Georas","MacIlurick", of(2010, 3, 11)));
        people.put(Person.id ,new Person("Alena","Fawlo", of(2010, 5, 7)));
        people.put(Person.id ,new Person("Dall","Woodburn", of(2011, 6, 28)));
        people.put(Person.id ,new Person("Teodorico","Milvarnie", of(2010, 5, 30)));

        findPeople("Woodburn",people);  //Task3
        findPeople("Kelshaw","Dall",people);  //Task3

        peopleBirthdayWithoutSeason(SUMMER,people); //Task4
    }
}
