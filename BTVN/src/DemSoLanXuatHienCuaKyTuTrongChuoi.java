import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        String chuoi = "Nguyen Anh Duc";
//Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị.

        char c = 'u';
//Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
        int count = 0;
//Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi.
        for (int i = 0; i < chuoi.length(); i++) {
            // Trong quá trình duyệt: so sánh nếu ký tự trong chuỗi bằng ký tự nhập vào thì tăng biến đếm lên 1
            if (chuoi.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(c + " có tồn tại " + count + " lần");
    }
}
