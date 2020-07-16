public class CastingAndReview {
    public static void main(String[] args) {
        review10();
    }
    public static void review10() {
        String str = "Привет";
        str = str.concat("Мир");
        System.out.println(str);
    }


    // compareToIgnoreCase(String str)
    public static void review9() {
        String str1 = "a";
        String str2 = "A";
        String str3 = "d";
        int result = str1.compareToIgnoreCase(str2);
        System.out.println("Результат сравнения = " + result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println("Результат сравнения = " + result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println("Результат сравнения = " + result);
    }

    // compareTo
    public static void review8() {
        String str1 = "а";
        String str2 = "а";
        String str3 = "д";
        int result = str1.compareTo(str2);
        System.out.println("Результат сравнения = " + result);

        result = str2.compareTo(str3);
        System.out.println("Результат сравнения = " + result);

        result = str3.compareTo(str1);
        System.out.println("Результат сравнения = " + result);
    }

    // codePointCount
    public static void review7() {
        String str = "мы учимся в Телран";
        int cpc = str.codePointCount(2, 11);
        System.out.println(cpc);
    }

    // codePointBefore(int index) - пример использования
    public static void review6() {
        String testStr = "ZГруппа студентов";
        int result = testStr.codePointBefore(1);
        System.out.println(result);
    }

    // codePointAt();
    public static void review5() {
        String testStr = "ZГруппа студентов";
        int result = testStr.codePointAt(0);
        System.out.println(result);

    }

    //substring
    public static void review4() {
        String name = "Василий";
        String myLittleString = name.substring(name.length() - 1);
        System.out.println(myLittleString);
        char myChar = name.charAt(name.length() - 1);
        System.out.println(myChar);
    }

    // charat
    public static void review3() {
        String name = "Василий";
        char myNewChar = name.charAt(0);
        String myResultString = "" + myNewChar + myNewChar + myNewChar;
        String myResultString2 = String.valueOf(myNewChar + myNewChar + myNewChar);  // инт
        int myInt = myNewChar + myNewChar + myNewChar;
        double myTestDouble = myInt;
    }

    // String to double to String
    public static void review2() {
        double pi = 3.14;
        String myPi = String.valueOf(pi);
        System.out.println(myPi + pi);
        double myNewPi = Double.parseDouble(myPi);
    }

    // String to int to String
    public static void review1() {
        // мой прекрасный красивый и великолепный код, от которого все
        String number = "780";
        int result = Integer.parseInt(number);
        System.out.println("это мой инт " + result);
        String myNewString = String.valueOf(result);
        System.out.println("Это мой стринг " + myNewString);
    }
}
