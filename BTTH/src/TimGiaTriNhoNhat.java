import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {9, 8, 5, 10, 12, 15};
        int index=minValue(arr);
        System.out.println("The Smallest element in the array is: "+arr[index]);
    }

    public static int minValue(int[] array){
        int index=0;
        for(int i=1;i< array.length;i++){
            if(array[i]<array[index]){
                index=i;
            }
        }
        return index;
    }
}
