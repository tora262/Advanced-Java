package ra.sort.basicsort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 13, 6, 12, 2, 3, 7, 4};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j-1] > arr[j]; j--) {
                swap(arr, j - 1, j);
            }
        }
    }

    private static void swap(int[] arr, int i1, int i2) {
        arr[i1] += arr[i2];
        arr[i2]= arr[i1] - arr[i2];
        arr[i1] -= arr[i2];
    }
}
