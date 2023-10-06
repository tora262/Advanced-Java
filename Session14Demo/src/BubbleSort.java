
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 13, 6, 12, 2, 3, 7, 4};
        bubbleSort(arr);
    }

    /**
     * Thuật toán nổi bọt, sắp xếp theo thứ tự tăng dần
     * @param arr mảng cần sắp xếp
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i1, int i2) {
        if (arr[i1] > arr[i2]) {
            arr[i1] += arr[i2];
            arr[i2]= arr[i1] - arr[i2];
            arr[i1] -= arr[i2];
        }
    }
}
