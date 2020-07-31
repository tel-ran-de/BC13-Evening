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


        System.out.println(blackjack(19, 21));// â†’21
        System.out.println(blackjack(21, 19));// â†’21
        System.out.println(blackjack(19, 22));// â†’19
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


    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        }


        return Math.max(a, b);
    }
}
