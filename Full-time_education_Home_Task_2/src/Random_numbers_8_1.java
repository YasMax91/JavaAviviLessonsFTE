import java.util.Arrays;

public class Random_numbers_8_1 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        arr[0] = 6;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 4;
        arr[6] = 1;
        arr[7] = 3;
        for (int i = arr[0]; i < arr.length; i++) {

            System.out.println(Arrays.toString(arr));
        }
    }
}