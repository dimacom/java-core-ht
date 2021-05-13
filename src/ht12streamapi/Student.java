package ht12streamapi;

import java.time.LocalDate;

public class Student extends Person {
    private String group;
    private int course;

    public Student(String firsName, String lastName, LocalDate birthday) {
        super(firsName, lastName, birthday);
    }

    public Student(String lastName, String firsName, LocalDate birthday, String group, int course) {
        super(lastName, firsName, birthday);
        this.group = group;
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", course=" + course +
                ", birthday=" + super.getBirthday() +
                ", firsName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
