public class Grundlagen {
    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(sum(2_100_300_000, 2_100_300_000)); //4 mlrd
        //System.out.println(Integer.MAX_VALUE);
    }

    public static int sum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "Value of " + a + " + " + b + " is too large to add.";
        final int result = a + b;
        assert (result - a == b) : "Sum of " + a + " + " + b + " returned wrong sum " + result;
        return result;
    }
}
