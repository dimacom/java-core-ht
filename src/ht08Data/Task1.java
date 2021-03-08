package ht08Data;

import java.time.LocalDate;

public class Task1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        int dayOFYear = date.getDayOfYear();
        LocalDate customDate = LocalDate.of(year, month, dayOfMonth);
        System.out.println("current day of year - " + dayOFYear);
        System.out.println("current date - " + customDate);
        System.out.println("current day of year + current date " + customDate.plusDays(dayOFYear));
    }
}
