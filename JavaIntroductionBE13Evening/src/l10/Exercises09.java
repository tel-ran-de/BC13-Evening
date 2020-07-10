package l10;

public class Exercises09 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13)); // 8
        System.out.println(close10(13, 8)); // 8
        System.out.println(close10(13, 7)); // 0
    }

    public static int close10(int values1, int values2) {
        int difference1 = Math.abs(10 - values1);
        int difference2 = Math.abs(10 - values2);

        if (difference1 < difference2) {
            return values1;
        } else if (difference1 > difference2) {
            return values2;
        } else {
            return 0;
        }
    }
}
