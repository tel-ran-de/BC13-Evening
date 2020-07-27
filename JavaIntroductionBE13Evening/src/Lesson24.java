public class Lesson24 {
    public static void main(String[] args) {
      /*  System.out.println(nearTen(12)); //true
        System.out.println(nearTen(17)); //false
        System.out.println(nearTen(19));// →true

        System.out.println(teaParty(6, 8));// → 1
        System.out.println(teaParty(3, 8));// → 0
        System.out.println(teaParty(20, 6));// → 2*/
       /* System.out.println(twoAsOne(1, 2, 3));// →true
        System.out.println(twoAsOne(3, 1, 2));// →true
        System.out.println(twoAsOne(3, 2, 2)); //false*/

        System.out.println(lastDigit(23, 19, 13)); //true
        System.out.println(lastDigit(23, 19, 12));// →false
        System.out.println(lastDigit(23, 19, 3));// →true
    }

    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        }
        return 1;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }
}