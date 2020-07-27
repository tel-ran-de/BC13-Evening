import org.w3c.dom.ls.LSOutput;

public class HW15 {
    public static void main(String[] args) {
        String str1 = "Василий";
        String str2 = "Василиса";
        //contains(CharSequence s)
        System.out.println("contains(CharSequence s)");
        System.out.println(str1.contains("Andrej"));
        System.out.println(str1.contains("аси"));
        split();
        //endsWith(String suffix)
        System.out.println("endsWith(String suffix)");
        System.out.println(str1.endsWith("лий"));
        System.out.println(str1.endsWith(str2));
        split();
        //equals(Object anObject)
        System.out.println("equals(Object anObject)");
        System.out.println(str1.equals(str2));
        System.out.println("андрей".equals("андрей"));
        split();

        // equalsIgnoreCase(String anotherString)
        System.out.println("equalsIgnoreCase(String anotherString)");
        System.out.println(str1.equalsIgnoreCase("вАсИлиЙ"));
        split();
        // isEmpty()
        System.out.println(str1.isEmpty());
        System.out.println("".isEmpty());
        split();
        // length()
        System.out.println(str1.length());
        split();
        //replace(char oldChar, char newChar)
        System.out.println("replace(char oldChar, char newChar)");
        System.out.println(str1.replace('и', 'I'));
        split();
        // startsWith(String prefix)
        System.out.println("startsWith(String prefix)");
        System.out.println(str1.startsWith("Вас"));
        System.out.println(str1.startsWith("Анд"));
        split();
        //substring(int beginIndex)
        System.out.println(str1.substring(3));
        split();
        //toLowerCase()
        //toUpperCase()
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        split();
        //trim()
        System.out.println("                    hgfhhhhh                   hhhhhhhhhh                   ".trim());

    }

    private static void split() {
        System.out.println("---------------------------");
    }


}
