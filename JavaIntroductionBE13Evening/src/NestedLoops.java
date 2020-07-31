public class NestedLoops {
    public static void main(String[] args) {
        chess(8);
    }

    private static void chess(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkOdd(i) && !checkOdd(j) || !checkOdd(i) && checkOdd(j)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static boolean checkOdd(int n) {
        return n % 2 == 0;
    }
}
