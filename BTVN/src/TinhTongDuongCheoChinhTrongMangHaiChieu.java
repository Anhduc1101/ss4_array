import java.util.Scanner;

public class TinhTongDuongCheoChinhTrongMangHaiChieu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Phần tử thứ " + i + " " + j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//      Đường chéo chính:
        int sumChinh = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumChinh += matrix[i][i];
        }
        System.out.println("Tổng đường chéo chính là: " + sumChinh);

//      Đường chéo phụ:
        int sumPhu = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumPhu += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Tổng đường chéo phụ là: " + sumPhu);
    }
}


