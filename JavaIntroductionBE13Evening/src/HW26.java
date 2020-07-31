public class HW26 {
    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));// → 6
        System.out.println(luckySum(1, 2, 13));// → 3
        System.out.println(luckySum(1, 13, 3));// → 1
    }

    private static int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return b + a;
        }
        return a + b + c;
    }
}
