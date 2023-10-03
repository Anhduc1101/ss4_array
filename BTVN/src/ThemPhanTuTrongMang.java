import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] arr = {0, 1, 2, 3, 4, 5};
        System.out.println("Mảng hiện tại gồm các phần tử sau: " + Arrays.toString(arr));

//        Bước 2: Nhập X là số cần chèn
        System.out.println("Nhập thêm 1 phần tử bất kì:");
        int addEl = scanner.nextInt();

//        Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = scanner.nextInt();
        if(index<0||index>= arr.length){
            System.out.println("Phần tử của bạn nằm ngoài mảng");
        }else{
            int[] newArr=new int[arr.length+1];
            for (int i=0;i<index;i++){
                newArr[i]=arr[i];
            }
            for (int i=index;i< arr.length;i++){
                newArr[i+1]=arr[i];
            }
            newArr[index]=addEl;
                System.out.println("Mảng sau khi chèn gồm các phần tử sau: " + Arrays.toString(newArr));
                System.out.println("Phần tử bạn vừa nhập là: " + addEl + " tại vị trí số: " + index);
        }

    }
}
