import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        Collections.sort(integerList, Collections.reverseOrder());

        Collections.reverse(integerList);

        System.out.println("Duyệt bằng for-each");
        for (Integer i : integerList) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = integerList.listIterator();

        System.out.println("Duyệt bằng iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
