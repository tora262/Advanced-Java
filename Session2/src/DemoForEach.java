import java.util.ArrayList;
import java.util.Collection;

public class DemoForEach {
    public static void main(String[] args) {
        Collection<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");

        for (String language : languages) {
            System.out.println(language);
        }

        languages.forEach(language -> {
            System.out.println(language);
        });
    }
}
