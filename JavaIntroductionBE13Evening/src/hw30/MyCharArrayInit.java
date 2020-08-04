package hw30;

import java.util.Arrays;

public class MyCharArrayInit {
    public static void main(String[] args) {
        char[] c = new char[50];
        c[0] = 100;
        c[1] = '€';
        myPrintCharArray(c);
        myPrintCharArray(fillMyCharRandom(c));

    }

    private static char[] fillMyCharRandom(char[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) (Math.random() * 1000);
        }

        return c;
    }

    private static void myPrintCharArray(char[] myArrayChar) {
        System.out.println("Символьный массив, длинной - " + myArrayChar.length);
        for (int i = 0; i < myArrayChar.length; i++) {
            System.out.print(myArrayChar[i] + " ");
        }
        System.out.println("\nМассив на экран выведен успешно");
    }
}
