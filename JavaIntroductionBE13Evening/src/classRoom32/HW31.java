package classRoom32;
public class HW31 {
    public static void main(String[] args) {
       /* int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{7, 1, 2, 3, 4, 9};
        int[] c = new int[]{3, 5};
        IntInitLesson30.myIntArrayPrint(makeMiddle(a));// → [2, 3]
        IntInitLesson30.myIntArrayPrint(makeMiddle(b));// → [2, 3]
        IntInitLesson30.myIntArrayPrint(makeMiddle(c));//→ [1, 2]

        int[] d = new int[]{1, 2, 3, 4, 5};
        int[] f = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] j = new int[]{1, 2, 3};

        IntInitLesson30.myIntArrayPrint(midThree(d));// → [2, 3, 4]
        IntInitLesson30.myIntArrayPrint(midThree(f));// → [7, 5, 3]
        IntInitLesson30.myIntArrayPrint(midThree(j));// → [1, 2, 3]
        int[] a2 = new int[]{1, 3, 4, 5};
        int[] b2 = new int[]{2, 1, 3, 4, 5};
        int[] c2 = new int[]{1, 1, 1};*/

       /* int[] a1 = new int[]{1, 3, 4, 5};
        int[] b1 = new int[]{2, 1, 3, 4, 5};
        int[] c1 = new int[]{1, 1, 1};
        System.out.println(unlucky1(a1));//→ true
        System.out.println(unlucky1(b1));//→ false
        System.out.println(unlucky1(c1));//→ false*/

        int[] a1 = new int[]{1, 2, 3};
        int[] b1 = new int[]{1, 2, 3, 1};
        int[] c1 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(a1)); //→false
        System.out.println(sameFirstLast(b1)); //→true
        System.out.println(sameFirstLast(c1));// →true
    }

    public static boolean sameFirstLast(int[] arr) {
        if (arr.length > 0 && arr[0] == arr[arr.length - 1]) {
            return true;
        } else return false;
    }
    //   We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    //   Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    // позиции "unlucky"  если за 1 идет 3.
    // верните true если "unlucky" позиции находятся на первых двух, поседних двух

    public static boolean unlucky1(int[] arr) {
        return arr[0] == 1 && arr[1] == 3 || (arr[arr.length - 2] == 1 && arr[arr.length - 1] == 3);
    }

    public static int[] makeMiddle(int[] arr) {
        int[] temp = new int[2];
        temp[1] = arr[arr.length / 2];
        temp[0] = arr[arr.length / 2 - 1];
        return temp;
    }

    public static int[] midThree(int[] arr) {
        int[] mid = new int[3];
        mid[0] = arr[arr.length / 2 - 1];
        mid[1] = arr[arr.length / 2];
        mid[2] = arr[arr.length / 2 + 1];
        return mid;
    }
}

