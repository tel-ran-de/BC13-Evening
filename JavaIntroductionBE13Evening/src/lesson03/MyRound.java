package lesson03;

public class MyRound {
    public static void main(String[] args) {
        final double PI = Math.PI;
        double myNewPi = mySuperRound(PI); // 2 цифры после запятой

        System.out.println("my new pi = " + myNewPi);
    }

    public static double mySuperRound(double digitsToRound) {
        double temp0 = digitsToRound * 100;
        int temp = (int) temp0;
        double temp2 = temp;
        return temp2 / 100;
    }

    public static void chess() {
        int cellCount = 64;
        int power = 2; //
        /*
        Первая клетка 1
        2-ая  - 2
        3-я  - 4
        4-1  - 8
        16
        32
        64
        128
        256
        что мне надо 2 возвести в степень (64-1) и прибавить зёрнышко из первой клетки
        искомое = (2^63) + 1;  9223372036854775807

         */
    }
}
