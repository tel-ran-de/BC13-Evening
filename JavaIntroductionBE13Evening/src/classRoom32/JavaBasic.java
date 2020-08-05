package classRoom32;

public class JavaBasic {
    public static void main(String[] args) {
   /*     int[] a = new int[]{1, 3, 4, 5};
        int[] b = new int[]{2, 1, 3, 4, 5};
        int[] c = new int[]{1, 1, 1};
        System.out.println(unlucky1(a));
        System.out.println(unlucky1(b));
        System.out.println(unlucky1(c));*/
       /* int[] a2 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 2, 3, 1};
        int[] c2 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(a2));
        System.out.println(sameFirstLast(b2));
        System.out.println(sameFirstLast(c2));*/
        /*int[] a1 = new int[]{1, 2, 3, 4};
        int[] b1 = new int[]{7, 1, 2, 3, 4, 9};
        int[] c1 = new int[]{1, 2};
        myIntArrayPrint(makeMiddle(a1)); //[2,3]
        myIntArrayPrint(makeMiddle(b1)); //[2,3]
        myIntArrayPrint(makeMiddle(c1)); //[1,2]*/
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] c = new int[]{1, 2, 3};
        myIntArrayPrint(midThree(a)); //[2,3,4]
        myIntArrayPrint(midThree(b)); //[7,5,3]
        myIntArrayPrint(midThree(c)); //[1,2,3]
    }

    public static int[] midThree(int[] arr) {
        int[] mid = new int[3];
        mid[0] = arr[arr.length / 2 - 1];
        mid[1] = arr[arr.length / 2];
        mid[2] = arr[arr.length / 2+1];

        return mid;

    }

    public static int[] makeMiddle(int[] arr) {
        int[] temp = new int[2];
        temp[1] = arr[arr.length / 2];
        temp[0] = arr[arr.length / 2 - 1];
        return temp;
    }


    private static boolean unlucky1(int[] arr) {
        return false;
    }

    private static boolean sameFirstLast(int[] a) {
        return false;
    }

    public static void myIntArrayPrint(int[] myArray) {
        System.out.println("Целочисленный массив, длиной - " + myArray.length);
        System.out.println("И его значения:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}
