public class Lesson43 {
    public static void main(String[] args) {


       /* System.out.println(lastTwo("coding"));// → "codign"
        System.out.println(lastTwo("cat")); //→ "cta"
        System.out.println(lastTwo("ab"));// → "ba"

        //1.поменять местами два последних символа*/


      /*  System.out.println(minCat("Hello", "Hi"));//→"loHi"
        System.out.println(minCat("Hello", "java"));// →"ellojava"
        System.out.println(minCat("java", "Hello"));// →"javaello
        System.out.println(minCat("telran", "Hi"));// → "anhi"
        //1.Проверить длину строк
        //2.Укоротить более длинную строку
        //3. Соеденить и вернуть*/

        System.out.println(atFirst("hello"));// → "he"
        System.out.println(atFirst("hi"));// → "hi"
        System.out.println(atFirst("h"));// → "h@"
        System.out.println(atFirst(""));// → "@@"
        //1. узнать длину строки
        // 2. взависимости от длины выполнить услов.и вернуть
    }

    public static String atFirst(String str) {
        String result = "";
        if (str.length() >= 2) {
            result = str.substring(0, 2);
        } else if (str.length() == 1) {
            result = str + "@";
        } else {
            result = "@@";
        }
        return result;
    }

    public static String minCat(String str1, String str2) {
        String result = "";
        if (str1.length() == str2.length()) {
            result = str1 + str2;
        } else if (str1.length() > str2.length()) {
            int subtraction = str1.length() - str2.length();
            result = str1.substring(subtraction) + str2;
        } else {
            int subtraction = str2.length() - str1.length();
            result = str1 + str2.substring(subtraction);
        }
        return result;
    }


    public static String lastTwo(String str) {
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }


}
