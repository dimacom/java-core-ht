package ht12streamapi;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;


    public Person(String firstName, String lastName, LocalDate birthday) {
        this.birthday = birthday;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                ", firsName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
