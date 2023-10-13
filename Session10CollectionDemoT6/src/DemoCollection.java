import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DemoCollection {
    public static void main(String[] args) {
        Collection<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.addAll(new ArrayList<>());

        System.out.println("Kích thước của collection: " + arrayList.size());
        System.out.println(arrayList.isEmpty() ? "Collection đang rỗng" : "Collection đang không trống");

        System.out.println(arrayList.contains(1) ? "Collection có chứa phần tử 1" : "Collection không chứa phần tử 1");;
        List<Integer> searchCollection = new ArrayList<>();
        searchCollection.add(5);
        searchCollection.add(6);

        Collection<String> strings;
        Collection<Student> students;
        Collection<Element<String, Integer>> elements;
        Map

        if (arrayList.containsAll(searchCollection)) {
            System.out.println("Trong collection có chứa các phần tử sau:");
            for (Integer e : searchCollection) {
                System.out.println("+ " + e);
            }
        }

        arrayList.clear();

        System.out.println(arrayList.size() == 0 ? "Đã giải phóng dữ liệu collection" : "Giải phóng dữ liệu collection chưa thành công");
    }
}