import java.util.Scanner;

public class DemoBinarySearching {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 9, 11, 15, 17, 19, 20, 21, 24};
        while (true) {
            System.out.println("Hãy nhập vào giá trị cần tìm kiếm");
            Scanner scanner = new Scanner(System.in);
            int searchNumber = Integer.parseInt(scanner.nextLine());
            int mid;
            int low = 0;
            int high = arr.length - 1;
            boolean isNotFound = true;

            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[mid] == searchNumber) {
                    System.out.printf("Phần tử %d cần tìm nằm ở vị trí %d\n", searchNumber, mid);
                    isNotFound = false;
                    break;
                }

                if (arr[mid] < searchNumber) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (isNotFound) {
                System.out.println("Không tìm được phần tử");
            }
        }


    }
}
