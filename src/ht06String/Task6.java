package ht06String;

public class Task6 {
    public static void main(String[] args) {
        String string1 = "Ba,d ab";
        string1 = string1.replaceAll("[^\\w]", "");
        String string2 = new StringBuilder(string1).reverse().toString();
        System.out.println(string1.compareToIgnoreCase(string2) == 0);
    }
}
