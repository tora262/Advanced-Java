import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(3, 3);
        hashMap.put(2, 2);
        hashMap.put(1, 1);

        Map<String, Integer> stringHashMap = new HashMap<>();
        stringHashMap.put("C", 3);
        stringHashMap.put("A", 2);
        stringHashMap.put("B", 1);

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3, 3);
        linkedHashMap.put(2, 2);
        linkedHashMap.put(1, 1);

        Map<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        treeMap.put("A", "ABC");
        treeMap.put("B", "CSDS");
        treeMap.put("K", "ADE");

    }
}
