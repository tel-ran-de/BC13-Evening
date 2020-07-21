public class LeapYear {
    public static void main(String[] args) {
/*        System.out.println(simpleLeapYear(1900)); // true
        System.out.println(simpleLeapYear(2000)); // true
        System.out.println(simpleLeapYear(2001)); // false*/
        System.out.println(notSimpleCheckLeapYear(1900));  // false
        System.out.println(notSimpleCheckLeapYear(2000));  // true
        System.out.println(notSimpleCheckLeapYear(2001)); // false
    }

    private static boolean notSimpleCheckLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0) ^ (year % 100 == 0);
    }

    private static boolean simpleLeapYear(int year) {
        return year % 4 == 0;
    }

    public static void printLeapYear(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (notSimpleCheckLeapYear(i)) {
                System.out.println(i);
            }
        }
    }

    public static int countLeapYear(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (notSimpleCheckLeapYear(i)) {
                count = count + 1;
            }
        }
        return count;
    }
}
