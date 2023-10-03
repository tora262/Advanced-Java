import java.util.*;

public class MinStringInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paragraph = scanner.nextLine();
        List<String> words = new ArrayList<>(Arrays.asList(paragraph.split(" ")));
        words.forEach(System.out::println);
        System.out.println(Collections.max(words));

    }
}
