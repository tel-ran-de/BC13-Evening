public class Lesson28 {
    public static void main(String[] args) {
        /*int[] var1 = new int[]{1, 2, 6};
        int[] var2 = new int[]{6, 1, 2, 3};
        int[] var3 = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(var1));//true
        System.out.println(firstLast6(var2));//true
        System.out.println(firstLast6(var3));//false*/
        int[] var1 = {1, 2, 3};
        int[] var2 = {7, 3};
        int[] var3 = {7, 3, 2};
        int[] var4 = {1, 3};
        System.out.println(commonEnd(var1, var2));//true
        System.out.println(commonEnd(var1, var3));//false
        System.out.println(commonEnd(var1, var4));//true
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    private static boolean firstLast6(int[] n) {
        return n[0] == 6 || n[n.length - 1] == 6;
    }
}