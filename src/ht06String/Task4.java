package ht06String;

public class Task4 {

    public static void main(String[] args) {

        String string1 = "abcd";
        String string2 = "abf";
        String result = string1;
        for (int i = 0; i < string2.length(); i++) {
            String l = string2.substring(i, i + 1);
            if (string1.contains(l)) {
                string1 = string1.replaceFirst(l, "");
                result = result.replaceFirst(l, "");
            } else {
                result += l;
            }
        }
        System.out.println(result);
    }
}