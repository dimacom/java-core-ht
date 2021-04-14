package ht11IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Task1 {
    private static final String FILE = "buffered.txt";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(asList("Line1", "Line2 ", "Line3"));
        System.out.println(write(list, FILE));
    }

    public static boolean write(List<String> list, String fileName) {
        try (BufferedWriter bW = new BufferedWriter(new FileWriter(fileName))) {
            for (String string : list) {
                bW.write(string);
                bW.newLine();
            }
            return true;
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }
}
