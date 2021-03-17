package ht09Class.task1;

import java.util.Arrays;

public class DataAnalyst extends Employee {
    private Boolean phd;
    private String[] mlMethods;

    public DataAnalyst(String name, String emailAddress, int experience, Boolean phd, String[] mlMethods) {
        super(name, emailAddress, experience);
        this.phd = phd;
        this.mlMethods = mlMethods;
    }

    public Boolean isPhd() {
        return phd;
    }

    public String[] getMlMethods() {
        return mlMethods;
    }

    @Override
    public String toString() {
        return super.toString() + " DataAnalyst{" +
                "phd=" + phd +
                ", mlMethods=" + Arrays.toString(mlMethods) +
                '}';
    }
}
