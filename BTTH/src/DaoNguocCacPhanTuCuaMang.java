import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Khai báo các biến,
        int size;
        int[] array;
        do {
//        nhập
            System.out.println("Enter size:");
            size = sc.nextInt();
//        và kiểm tra kích thước mảng
            if (size > 20) {
                System.out.println("Sized does not exceed 20");
            }
        } while (size > 20);
//        Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
//        đảo ngược
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
//        In ra mảng đã nhập
        System.out.printf("\n%-20s%s ", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

