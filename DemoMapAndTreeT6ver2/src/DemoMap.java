import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DemoMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty() ? "Map đang rỗng" : "Map đang có chứa dữ liệu");
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");

        map.replace(1, "100");
        map.replace(5, "1000");
        map.remove(2);
        map.remove(1, "1");

        Set<Integer> keySet = map.keySet();
        System.out.println("Các cặp key/value của map là:");
        for (Integer key : keySet) {
            System.out.println(key + " : " + map.get(key));
        }

    }
}