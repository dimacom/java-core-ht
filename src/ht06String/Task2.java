package ht06String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {

        final String regex = "\\b([a-h]|[A-H])\\w*";
        final String string = "I'm in my penthouse  Half naked I cooked this meal for you naked";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.printf("Full match: [%s]\n",  matcher.group(0));

        }
    }
}
