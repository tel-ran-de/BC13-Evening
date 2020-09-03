import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(Arrays.toString(array));
        boolean[] b = new boolean[10];
        System.out.println(Arrays.toString(b));
        weatherIsGood();
        String[] s = new String[5];
        System.out.println(Arrays.toString(s));

    }

    public static boolean weatherIsGood() {
        return false;
    }
}
