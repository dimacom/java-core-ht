package ht11IOStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ht11IOStream.Task1.write;
import static java.util.Arrays.asList;

public class Task3 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>(3);
        map.put("file1.txt", new ArrayList<>(asList("Line1", "Line2")));
        map.put("file2.txt", new ArrayList<>(asList("Line3", "Line4")));
        map.put("file3.txt", new ArrayList<>(asList("Line5", "Line6")));
        filesByMap(map);
    }

    private static void filesByMap(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            write(stringListEntry.getValue(), stringListEntry.getKey());
        }
    }
}
