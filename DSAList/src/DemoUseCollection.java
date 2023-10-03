import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoUseCollection {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add((int) (Math.random() * 1000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian thêm array list: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian truy xuất của array list: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian remove array list: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add((int) (Math.random() * 1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thêm của linked list: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian truy xuất của linked list: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian remove linked list: " + (endTime - startTime));
    }
}
