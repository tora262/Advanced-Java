import java.util.Scanner;

public class LinearSearch {
    static int[] arr = {1, 3, 5, 2, 4, 6, 10, 8, 7};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào số cần tìm kiếm:");
            int search = scanner.nextInt();
            linearSearch(search);
        }
    }

    private static void linearSearch(int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Phần tử cần tìm nằm ở vị trị thứ " + i);
                return;
            }
        }
        System.out.println("Phần tử cần tìm không tồn tại");
    }
}