package ht07Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {

        String regex = "\\s\\w+\\@\\w+\\.([com]{3}|[ru]{2}|[by]{2})";
        String string = " mail@mail.ru, 2mail@mail.by, mail@mail..com, mail@@mail.com," +
                        " mail@mail.mail.com, mail@mail@mail.com," +
                        " @mail.com, mail.com, mail@mail, mail@.com  3mail@mail.com";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}
