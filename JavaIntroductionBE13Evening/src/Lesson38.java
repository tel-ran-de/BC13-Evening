public class Lesson38 {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));//true
        System.out.println(xyzMiddle("AxyzBB"));//true
        System.out.println(xyzMiddle("AxyzBBB"));//→false
        System.out.println(myIndexOf('z', "AxyzBBB"));
        // middle str
        //controlSum
    }

    public static int myIndexOf(char c, String s) {
        String inputChar = String.valueOf(c);
        if (s.contains(inputChar)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean xyzMiddle(String str) {
        int startRange = str.indexOf('x');
        int endRange = str.length() - (str.indexOf('z') + 1);
        int controlSum = Math.abs(startRange - endRange);
        if (controlSum <= 1) {
            return true;
        }
        return false;
    }
}