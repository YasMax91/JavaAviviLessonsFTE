import java.util.Arrays;

public class BubbleAlgorithmTwoIf {
    public static void main(String[] args) {
        int[] bubble = {78, 89, 32, 44, 55, 12, 99, 28, 54, 69};
        System.out.println(Arrays.toString(bubble));
        int temp;
        for (int a = 1; a < bubble.length; a++) {
            for (int b = bubble.length - 1; b >= a; b--)
                if (bubble[b - 1] > bubble[b]) {
                    temp = bubble[b - 1];
                    bubble[b - 1] = bubble[b];
                    bubble[b] = temp;

                    {
                        System.out.println(Arrays.toString(bubble));
                    }
                }
        }
    }
}