import java.util.Scanner;

public class TimGTNNTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        int size;
        int[] arr;
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size shoundn't exceed 20");
            }
        } while (size > 20);
//Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element for new array: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
//Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int min = arr[0];
//Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mang
        for (int j = 1; j < arr.length; j++) {
//            So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất.
            if (arr[j] < min) {
//            Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo.
                min = arr[j];
            }
        }
//Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
        System.out.println("The smallest element in array is: " + min + " at position " + i);
    }
}
