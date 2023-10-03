import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Khai báo mảng chứa danh sách sinh viên
        String[] students = {"Anh", "Bảnh", "Chánh", "Danh", "Em"};
//        Khai báo biến lưu tên tìm kiếm và gán với giá trị nhập vào
        System.out.println("Enter a name's student:");
        String input_name = scanner.nextLine();
//        Duyệt mảng sinh viên đã khai báo ở trên,
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
//            tìm phần tử có giá trị bằng với tên đã nhập vào.
            if (students[i].toLowerCase().equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
