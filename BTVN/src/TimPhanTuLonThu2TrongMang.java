import java.util.Scanner;

public class TimPhanTuLonThu2TrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 15, 7, 3, 1, 9, 10, 2};
        int index = secondMaxValue(arr);
        System.out.println("The second max value in array is: " + arr[index]);
    }

    public static int secondMaxValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
            for (int j = 1; j < i; j++) {
                if (array[j] > array[i]) {
                    index = j;
                }
            }
        }
        return index;
    }
}
