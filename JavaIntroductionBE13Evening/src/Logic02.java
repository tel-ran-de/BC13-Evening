public class Logic02 {
    public static void main(String[] args) {
/*        System.out.println(noTeenSum(1, 2, 3)); // →6
        System.out.println(noTeenSum(2, 13, 1)); //→3
        System.out.println(noTeenSum(2, 1, 14)); //→3*/

/*        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0*/

        System.out.println(roundSum(16, 17, 18)); //→ 60
        System.out.println(roundSum(12, 13, 14)); // → 30
        System.out.println(roundSum(6, 4, 4)); // → 10
/*
        System.out.println(round10(14));
        System.out.println(round10(16));
*/
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        if (num % 10 >= 5) {
            return (10 - num % 10) + num;
        } else {
            return num - num % 10;
        }
    }

    private static int loneSum(int a, int b, int c) {
        if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        }
        return a + b + c;
    }

    private static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if (n == 13 || n == 14 || (n >= 17 && n <= 19)) {
            return n = 0;
        }
        return n;
    }
}
