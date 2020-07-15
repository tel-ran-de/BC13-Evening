public class WarmUp {

    public static void main(String[] args) {
        System.out.println(sum(123)); //6
        System.out.println(sum(768)); // 21
    }

    public static int sum(int digit) {
        int sum = 0;
        int hundred = digit / 100;
        int then = (digit - hundred * 100) / 10;
        int single = digit - hundred * 100 - then * 10;
        sum = hundred + then + single;
        return sum;
    }

    public static int intReverse(int digit) {
        int output = 0;
        // int to String
        String tempInput = String.valueOf(digit);
        String tempOutput = "";
        for (int i = tempInput.length() - 1; i >= 0; i--) {
            // tempOutput = tempOutput + tempInput.substring(i, i + 1);
            tempOutput = tempOutput + tempInput.charAt(i);
        }

        // String to int
        output = Integer.parseInt(tempOutput);
        return output;
    }

    public static void alphabet() {
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            String str = repeatSymbol(c, 10);
            System.out.println(str);
        }
    }

    public static String repeatSymbol(char c, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output = output + c;
        }
        return output;
    }

    public static void fibonacci(int n) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 3; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    public static void mySecondLine(int n) {
        for (int i = 1; i < n; i *= 2) {
            System.out.print(i + " ");
        }
    }

    public static void myLine(int n) {
        for (int i = 7; i < n; i += 7) {
            System.out.println(i);
        }

/*        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }*/
    }

    public static void findDigits() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void happyDumplings() {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                System.out.println("Вот счастливый пельмень");
                break;
            }
        }
    }
}
