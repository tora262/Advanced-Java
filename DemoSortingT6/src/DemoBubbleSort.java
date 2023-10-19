public class DemoBubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 5, 1, 2, 3, 7, 9};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtil.swap(arr, j, j+1);
                }
            }
        }
    }
}