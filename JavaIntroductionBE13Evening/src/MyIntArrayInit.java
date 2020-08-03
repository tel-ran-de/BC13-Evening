public class MyIntArrayInit {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[]{1, 5, 7, 2, 18};
        //int dlina1 = a1.length;
        int[] a3 = {234, 345, 234, 34};
        int[] a4 = a1;
        int[] a5;
        a1[0] = 13;
        a4[5] = 20;
        myIntArrayPrint(a1);
        myIntArrayPrint(a4);
        int[] myTest = new int[0];

/*        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);*/
        //simpleType();
    }

    public static void myIntArrayPrint(int[] myArray) {
        System.out.println("Целочисленный массив, длиной - " + myArray.length);
        System.out.println("И его значения:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    private static void simpleType() {
        int a = 5;
        int b = a;
        a += 3;
        System.out.println(a);
        System.out.println(b);
    }
}
