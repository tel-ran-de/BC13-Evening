import lessonLessThan30.MyIntArrayInit;

public class ExercisesArray {
    public static void main(String[] args) {
        /*int[] a = new int[]{4, 5};
        int[] b = new int[]{4, 2};
        int[] c = new int[]{3, 5};
        System.out.println(no23(a));// →true
        System.out.println(no23(b));// →false
        System.out.println(no23(c));// →false*/

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{2, 3, 5};
        int[] c = new int[]{1, 2, 1};

        MyIntArrayInit.myIntArrayPrint(fix23(a));// → [1, 2, 0]
        MyIntArrayInit.myIntArrayPrint(fix23(b));// → [2, 0, 5]
        MyIntArrayInit.myIntArrayPrint(fix23(c));// → [1, 2, 1]

    }

    public static boolean no23(int[] arr) {
        return arr[0] != 2 && arr[0] != 3 && arr[arr.length - 1] != 2 && arr[arr.length - 1] != 3;
    }

    public static int[] fix23(int[] arr) {

        return arr;
    }
}
