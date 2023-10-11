package ra.sort.basicsort;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {9, 13, 6, 12, 2, 3, 7, 4};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);

        }
    }

    private static void swap(int[] arr, int i1, int i2) {
        arr[i1] += arr[i2];
        arr[i2]= arr[i1] - arr[i2];
        arr[i1] -= arr[i2];
    }
}
