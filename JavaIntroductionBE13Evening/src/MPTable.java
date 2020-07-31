public class MPTable {
    public static void main(String[] args) {
        mpGenerate(10);
    }

    private static void mpGenerate(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(digitForMP(i, j));
            }
            System.out.println();
        }
    }

    private static String digitForMP(int i, int j) {
        if (i * j < 10) {
            return "   " + i * j;
        } else if (i * j < 100) {
            return "  " + i * j;
        }
        return " " + i * j;
    }

}
