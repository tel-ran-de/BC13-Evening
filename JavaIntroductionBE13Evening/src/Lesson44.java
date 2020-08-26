public class Lesson44 {
    public static void main(String[] args) {
       /* System.out.println(comboString("Hello", "hi")); //→ "hiHellohi"
        System.out.println(comboString("hi", "Hello"));// → "hiHellohi"
        System.out.println(comboString("aaa", "b"));//→ "baaab"
        //1. найти длину стрингов
        //2. Соеденить короткий с длинным стринг*/
/*
        System.out.println(firstTwo("Hello"));// → "He"
        System.out.println(firstTwo("abcdefg"));// → "ab"
        System.out.println(firstTwo("ab"));// → "ab"
        //1.Вернуть строку двух первых char
        //2. Если короче длины 2 вернуть все что есть стриг

        System.out.println(makeTags("i", "Yay"));// →"<i>Yay</i>"
        System.out.println(makeTags("i", "Hello"));// →"<i>Hello</i>"
        System.out.println(makeTags("cite", "Yay"));// →"<cite>Yay</cite>"
        //2. создать Стринг в тэг и соеденить*/

       /* System.out.println(withoutX("xHix"));// → "Hi"
        System.out.println(withoutX("xHi"));// → "Hi"
        System.out.println(withoutX("Hxix"));// → "Hxi"
        // вырезать первый или последний Х*/

        System.out.println(without2("HelloHe"));//→ "lloHe" однинакове символы в начале и в конце
        System.out.println(without2("HelloHi"));// → "HelloHi"
        System.out.println(without2("Hi"));// → ""
        // 1. сравнить символы первые два с последними
        // 2.если равны первые два с последними то вырезаем первые два
        // 3. если не равны первые два и последние то вернем оригинал строки
        // 4. если стринг длиной 2 возвращаем пустой


    }

    public static String without2(String str) {
        String result = str;
        int lenStr = str.length();
        if (str.substring(0, 2).equals(str.substring(lenStr - 2))) {
            result = str.substring(2);
        }
        return result;
    }

    public static String withoutX(String str) {
        String result = str;
        if (result.startsWith("x")) {
            result = result.substring(1);
        }
        if (result.endsWith("x")) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static String makeTags(String tag, String word) {
        String start = "<" + tag + ">";
        String end = "</" + tag + ">";
        String result = start + word + end;
        return result;
    }

    public static String firstTwo(String str) {
        String result = str;
        int lenStr = str.length();
        if (lenStr < 2) {
            result = str;
        } else {
            result = str.substring(0, 2);
        }
        return result;
    }

    public static String comboString(String a, String b) {
        String longStr = b;
        String shortStr = a;
        if (a.length() > b.length()) {
            longStr = a;
            shortStr = b;
        }
        return shortStr + longStr + shortStr;
    }
}
