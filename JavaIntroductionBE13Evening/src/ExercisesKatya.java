/**
 * JavaIntroductionBE13Evening
 * 09 21 : 42
 */
public class ExercisesKatya {

    public static void main(String[] args) {
      /*  System.out.println(sleepIn(false, false));// true
        System.out.println(sleepIn(true, false));//false
        System.out.println(sleepIn(false, true));// true*/
        /*System.out.println(diff21(19));// 2
        System.out.println(diff21(10));// 11
        System.out.println(diff21(21));// 0*/
        // Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
        /*System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));//"kittn"
        System.out.println(missingChar("kitten", 4));// "kittn"*/
       /* System.out.println(backAround("cat"));// "tcatt"
        System.out.println(backAround("Hello"));// "oHelloo"
        System.out.println(backAround("a"));// "aaa"*/


        /*System.out.println(hasTeen(13, 20, 10));// true
        System.out.println(hasTeen(20, 19, 10)); // true
        System.out.println(hasTeen(20, 10, 13));// true
        System.out.println(hasTeen(20, 20, 20));// true*/

        System.out.println(mixStart("mix snacks"));// true
        System.out.println(mixStart("pix snacks"));// true
        System.out.println(mixStart("piz snacks"));// false
    }

    public static boolean mixStart(String input) {
        String start = input.substring(1, 3);
        String etalon = "ix";
        return start.equals(etalon);
    }


    public static boolean hasTeen(int a, int b, int c) {
       /* if (a >= 13 & a <= 19) {
            return true;
        } else if (b >= 13 & b <= 19) {
            return true;*/
        return c >= 13 & c <= 19 || (a >= 13 & a <= 19) || (b >= 13 & b <= 19);

    }

    public static boolean sleepIn(boolean weekDay, boolean vacation) {
        return !weekDay || vacation;
    }

    public static int diff21(int n) {
        int difference = Math.abs(21 - n);
        if (n < 21) {
            return difference;
        } else {
            return difference * 2;
        }
    }

    public static String missingChar(String s, int n) {
        return s.substring(0, n) + s.substring(n + 1);
    }

    public static String backAround(String str) {
        int lastIndex = str.length() - 1;
        String symbol = str.substring(lastIndex);
        //"str.length()-1"
        return symbol + str + symbol;
    }

    public static boolean startHi(String input) {
        String hi = "hi";
        String start = input.substring(0, 2);
        return start.equals(hi);
    }
}


