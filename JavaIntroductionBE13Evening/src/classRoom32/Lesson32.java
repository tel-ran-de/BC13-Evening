package classRoom32;

import lessonLessThan30.MyIntArrayInit;

public class Lesson32 {
    public static void main(String[] args) {
        //simpleDateType();
        int[] a = new int[10];
        int[] b = a;
        int[] c = b;
        b[0] = 30;
        a[1] = 20;
        MyIntArrayInit.myIntArrayPrint(b);
        MyIntArrayInit.myIntArrayPrint(a);
        MyIntArrayInit.myIntArrayPrint(c);

    }

    private static void simpleDateType() {
        int a = 5;
        int b = a;

        System.out.println(b);
    }
}
