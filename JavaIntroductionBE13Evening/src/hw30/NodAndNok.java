package hw30;

// least common multiple  = нок = Наименьшее общее кратное
// greatest common divisor  = нод = Наибольший общий делитель
public class NodAndNok {
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(5, 6)); // 1
        System.out.println(greatestCommonDivisor(15, 60)); // 15
        System.out.println(greatestCommonDivisor(9, 12)); // 3
        System.out.println(greatestCommonDivisor(8, 9)); // 1


        System.out.println(leastCommonMultiple(5, 6)); //30
        System.out.println(leastCommonMultiple(15, 60)); // 60
        System.out.println(leastCommonMultiple(9, 12)); // 36
        System.out.println(leastCommonMultiple(8, 9)); // 72
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return greatestCommonDivisor(b, a % b);
    }
}
