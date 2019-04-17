public class SortingDownArrays {
    public static void main(String[] args) {
        System.out.print("Непарные числа по убыванию: ");
        int[] arr = new int[100];
        for (int i = 99; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
    }
}
