package ht06String;

public class Task6 {
    public static void main(String[] args) {
        String string1 = "a hgfssfG hA";
        String string2 = "";
        string1 = string1.replaceAll(" ", "");
        string2 = new StringBuilder(string1).reverse().toString();
        if (string1.compareToIgnoreCase(string2) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
