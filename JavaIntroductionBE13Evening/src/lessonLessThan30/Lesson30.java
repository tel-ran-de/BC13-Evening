package lessonLessThan30;

class Lesson30 {
    public static void main(String[] args) {
        /*int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};
        int[] a4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        myIntArrayPrint(reverse3(a1));//3,2,1
        myIntArrayPrint(reverse3(a2));//3,2,1
        myIntArrayPrint(reverse3(a3));//3,2,1
        myIntArrayPrint(reverse3(a4));//3,2,1*/
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{4, 5, 6};
        int[] b1 = new int[]{7, 7, 7};
        int[] b2 = new int[]{3, 8, 0};
        int[] c1 = new int[]{5, 2, 9};
        int[] c2 = new int[]{1, 4, 5};
        myIntArrayPrint(middelWay(a1, a2));//2,5
        myIntArrayPrint(middelWay(b1, b2));//7,8
        myIntArrayPrint(middelWay(c1, c2));//2,4

    }

    public static int[] middelWay(int[] a, int[] b) {
        int[] c = new int[2];
        c[0] = a[1];
        c[1] = b[1];
        return c;
    }

    public static int[] reverse3(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - i - 1] = input[i];

        }
        return output;
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