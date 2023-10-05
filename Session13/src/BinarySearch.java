import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] arr = {1, 3, 5, 2, 4, 6, 10, 8, 7};
    public static void main(String[] args) {
        Arrays.sort(arr);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào số cần tìm kiếm:");
            int search = scanner.nextInt();
            binarySearch(search);
        }
    }

    private static void binarySearch(int search) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        while (high >= low) {
            mid = (high + low) / 2;
            if (search == arr[mid]) {
                System.out.println("Phần tử được tìm kiếm xuất hiện ở vị trí thứ " + mid);
                return;
            } else if (search < arr[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println("Phần tử tìm kiếm không có trong mảng");
    }
}
