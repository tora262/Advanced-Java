public class DemoInsertionSort {
    public static void main(String[] args) {

        int[] a = {6, 8, 5, 1, 2, 3, 7, 9};

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    ArrayUtil.swap(a, j, j-1);
                }
            }
        }
    }
}
