import java.lang.reflect.Array;
import java.util.Arrays;

public class Snowflake {
    public static void main(String[] args) {
        makeSnowflake(10);
    }

    private static void makeSnowflake(int n) {
        String star = "X";
        String symbol = " ";
        if (n % 2 == 0) {
            n = n + 1;
        }
        String[][] sFlake = new String[n][n];
        myArrayFill(sFlake, symbol);

        // 1. Линия
        for (int i = 0; i < sFlake.length; i++) {
            sFlake[i][n / 2] = star;
        }
        // 2. Линия
        for (int i = 0; i < sFlake.length; i++) {
            sFlake[n / 2][i] = star;
        }
        // 3. Линия
        for (int i = 0; i < sFlake.length; i++) {
            for (int j = 0; j < sFlake.length; j++) {
                if (i == j) {
                    sFlake[i][j] = star;
                }
            }
        }

        // 4. Линия
        for (int i = 0; i < sFlake.length; i++) {
            for (int j = 0; j < sFlake.length; j++) {
                if (i + j == n - 1) {
                    sFlake[i][j] = star;
                }
            }
        }
        printStringArray(sFlake);
    }

    private static void myArrayFill(String[][] array, String symbol) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = symbol;
            }
        }
    }
    
    private static void printStringArray(String[][] sFlake) {
        for (int i = 0; i < sFlake.length; i++) {
            for (int j = 0; j < sFlake.length; j++) {
                System.out.print(" " + sFlake[i][j] + " ");
            }
            System.out.println();
        }
    }
}
