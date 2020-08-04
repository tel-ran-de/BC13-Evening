package lessonLessThan30;

public class Main {
    public static void main(String[] args) {
        moLovelyTriangle(6);
    }

    private static void moLovelyTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(formatForTriangle(i));
        }
    }

    private static String formatForTriangle(int n) {
        String result0 = "";
        String tempResult = "";
        for (int i = 0; i < n; i++) {
            result0 = result0 + n;
            tempResult = result0;
        }
        result0 += tempResult;
        return result0;
    }
}
