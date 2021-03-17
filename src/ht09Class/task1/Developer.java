package ht09Class.task1;

import java.util.Arrays;

public class Developer extends Employee {

    private String mainLanguage;
    private String[] skills;

    public Developer(String name, String emailAddress, int experience, String mainLanguage, String[] skills) {
        super(name, emailAddress, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return super.toString() + " Developer{" +
                "mainLanguage='" + mainLanguage + '\'' +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
