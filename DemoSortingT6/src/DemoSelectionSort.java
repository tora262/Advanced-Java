public class DemoSelectionSort {
    public static void main(String[] args) {

        int[] a = {6, 8, 5, 1, 2, 3, 7, 9};
        for (int i = 0; i < a.length; i++) {
            int indexOfMax = 0;

            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[indexOfMax]) {
                    indexOfMax = j;
                }
            }
            ArrayUtil.swap(a, indexOfMax, a.length-i-1);
        }
    }
}
