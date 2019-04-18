import java.util.Arrays;

public class BubbleAlgorithmOneIf {
    public static void main(String[] args) {
        int[] bubble = {78, 89, 32, 44, 55, 12, 99, 28, 54, 69};
        System.out.println(Arrays.toString(bubble));
        int temp;
        for (int a = 1; a < bubble.length; a++) {
            for (int b = bubble.length - 1; b >= a; b--)
                if (bubble[a] < bubble[a - 1]) {
                    temp = bubble[a];
                    bubble[a] = bubble[a - 1];
                    bubble[a - 1] = temp;
                } else if (bubble[a - 1] > bubble[b]) {
                    temp = bubble[a - 1];
                    bubble[a - 1] = bubble[b];
                    bubble[b] = temp;
                }

            {
                System.out.println(Arrays.toString(bubble));
            }
        }
    }
}

