import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 2);
        map.put(1, 3);
        map.put(3, 3);
        map.put(4, 4);

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            System.out.println(entry);
        }
        map.keySet();
        System.out.println("for theo key:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " - value: " + map.get(key));
        }
        System.out.println("foreach của Map:");
        map.forEach((key, value) ->  System.out.println("Key: " + key + " - value: " + value));
        map.containsKey(1);
        map.containsValue(3);
        map.values();
    }
}