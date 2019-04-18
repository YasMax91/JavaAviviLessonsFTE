import java.util.Arrays;

public class BubbleAlgorithmTwoIf {
    public static void main(String[] args) {
        int[] bubble = {78, 89, 32, 44, 55, 12, 99, 28, 54, 69};
        System.out.println("початковий масив");
        System.out.println(Arrays.toString(bubble));
        System.out.println();
        int temp;
        for (int a = 1; a < bubble.length; a++) {
            System.out.println("початок блока for");
            System.out.println(Arrays.toString(bubble));
            for (int b = bubble.length - 1; b >= a; b--)
                if (bubble[a] < bubble[a - 1]) {
                    System.out.println("в блоці if міняю місцями " + bubble[a] + " з " + bubble[a - 1]);
                    temp = bubble[a];
                    bubble[a] = bubble[a - 1];
                    bubble[a - 1] = temp;
                } else if (bubble[a - 1] > bubble[b]) {
                    System.out.println("в блоці else if міняю місцями " + bubble[a - 1] + " з " + bubble[b]);
                    temp = bubble[a - 1];
                    bubble[a - 1] = bubble[b];
                    bubble[b] = temp;
                }
            System.out.println(Arrays.toString(bubble));
            System.out.println("кінець блока for");
            System.out.println();

            {
                System.out.println();
                System.out.println("кінцевий масив");
                System.out.println(Arrays.toString(bubble));
            }
        }
    }
}