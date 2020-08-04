package lessonLessThan30;

public class MyStringArrayInit {
    public static void main(String[] args) {
        int myRandom = (int) (Math.random() * 25 + 1);
        String[] myStr = new String[myRandom];
        myStringArrayPrint(myStr);

        String[] test = fillMyStringArray(myStr);
        myStringArrayPrint(test);
    }

    public static String[] fillMyStringArray(String[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = stringGenerate(10).toLowerCase();
        }
        return str;
    }

    private static String stringGenerate(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + oneLetter();
        }
        return result;
    }

    private static char oneLetter() {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letter = source.charAt((int) (Math.random() * source.length()));
        return letter;
    }

    private static void myStringArrayPrint(String[] myStr) {
        System.out.println("Строковый массив, длиной - " + myStr.length);
        for (int i = 0; i < myStr.length - 1; i++) {
            System.out.print(myStr[i] + ", ");
        }
        System.out.print(myStr[myStr.length - 1]);
        System.out.println();
    }
}
