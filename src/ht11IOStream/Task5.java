package ht11IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {
    public static final String FILE = "newfile.txt";

    public static void main(String[] args) {
        System.out.println(returnName(FILE));
    }

    private static String returnName(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            return "not found ";
        }
    }
}
