public class Exercise28 {
    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));// → "ja"
        System.out.println(twoChar("java", 2));// → "va"
        System.out.println(twoChar("java", 3));// → "ja"
    }

    private static String twoChar(String str, int digit) {
        String result = "";
        if (str.length() - digit >= 2) {
            result = str.substring(digit, digit + 2);
        } else result = str.substring(0, 2);
        return result;
    }
}
