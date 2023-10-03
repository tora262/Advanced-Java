import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hanoi");
        strings.add("Danang");
        strings.add("Hue");
        Iterator<String> listIterator = strings.listIterator();

        System.out.println("Last index of 'Hue' = " + strings.lastIndexOf("Hue"));

//        while (listIterator.hasNext()) {
//           System.out.println(listIterator.next().trim());
//        }

        for (String el : strings) {
            System.out.println(el);
        }
        strings.forEach(System.out::println);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Laptop");
        stringSet.add("Smartphone");
        stringSet.add("Laptop");
        stringSet.remove("Laptop");
        Main.display("Hello World");

        TestGeneric<Integer, Integer, Integer> testGeneric = new TestGeneric<>();
        testGeneric.doing(100, 200);
        testGeneric.display(1);

        Eagle<String> eagle = new Eagle<>();
        eagle.display("Eagle");

    }

    public static <T> void display(T t) {
        System.out.println(t);
    }
}