import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập giá trị phần tử cần xóa: ");
        int deletedEl = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == deletedEl) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                System.out.println("Phần tử đã bị xóa là phần tử : " + deletedEl + " tại vị trí thứ: " + arr[i]);
                break;
            }
        }
    }
}
