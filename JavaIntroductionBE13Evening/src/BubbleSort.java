import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArr = new int[]{104, 64, 34, 25, 12, 22, 11, 90};
        System.out.println(Arrays.toString(myArr));
        bubbleSorting(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    private static void bubbleSorting(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                int temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSorting(input);
        }
    }
}
