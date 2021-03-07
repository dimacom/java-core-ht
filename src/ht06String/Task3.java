package ht06String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {
        final String DELIMITER = ":";
        final String PREFIX = "-";
        final String regex = "\\b\\w+";
        final String string = "banana - a. bax, c, d  e";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        int counter = 0;
        while (matcher.find()) {
            counter++;
            if (counter == 1) System.out.println(matcher.group(0) + DELIMITER);
            if (counter != 1) System.out.println(PREFIX + matcher.group(0));
        }
    }
}
