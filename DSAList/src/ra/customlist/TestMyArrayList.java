package ra.customlist;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyList<String> strings = new MyArrayList<>();
        strings.add("Hanoi");
        strings.add("Hue");
        //displayArrayList(strings);
        //strings.remove("Hue");
        strings.add("Haiphong");
        strings.add("Hanoi");
    }

    static <E> void displayArrayList(MyList<E> myList) {
        for (E el : myList) {
            System.out.println(el);
        }
    }
}
