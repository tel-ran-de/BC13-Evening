package lesson04;

public class MagicMath {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a + b;
        System.out.println(c);
        a = a + b - (b = a);

        // = 5 + 3 - (5)
        System.out.println("A и Б сидели на трубе a = " + a + "; b = " + b);
    }
}
