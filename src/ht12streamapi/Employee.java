package ht12streamapi;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person implements Comparable<Employee> {
    private BigDecimal salary;
    private Positions position;

    public Employee(String firsName, String lastName, LocalDate birthday) {
        super(firsName, lastName, birthday);
    }

    public Employee(String lastName, String firsName, LocalDate birthday, BigDecimal salary, Positions position) {
        super(lastName, firsName, birthday);
        this.salary = salary;
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Positions getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                ", birthday=" + super.getBirthday() +
                ", firsName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary.compareTo(o.salary);
    }
}
