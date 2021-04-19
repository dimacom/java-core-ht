package ht11IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ht11IOStream.Task1.write;
import static java.util.Arrays.asList;

public class Task2 {
    private static final String FILE = "file.txt";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(asList("filename: newfile.txt", "content: content of file"));
        write(list, FILE);
        createNewFile(FILE);
    }

    public static void createNewFile(String file) {
        List<String> list = new ArrayList<>(1);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            final String NEW_FILE = reader.readLine().substring(10);
            list.add(reader.readLine().substring(9));
            write(list, NEW_FILE);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
