package ht09Class.Task1;

import java.util.regex.Pattern;

public class Employee {
    private String name;
    private String emailAddress;
    private int experience;
    private static final String EMAIL_REGEX = "^[^@]+@[^@]+\\.[^@]+$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    public Employee(String name, String emailAddress, int experience) {
        if (!checkFormat(emailAddress)) {
            throw new IllegalArgumentException("Invalid email format: " + emailAddress);
        }
        this.name = name;
        this.emailAddress = emailAddress;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getExperience() {
        return experience;
    }

    public static boolean checkFormat(String email) {
        return PATTERN.matcher(email).matches();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", experience=" + experience +
                '}';
    }
}
