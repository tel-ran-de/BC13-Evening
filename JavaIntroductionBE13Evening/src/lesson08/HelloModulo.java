package lesson08;

public class HelloModulo {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = b / a;
        int d = b % a;
        // d = b modulo (MOD) a ; 7 modulo 5; остаток деления 7 на 5;
        System.out.println(d);

        int aa = 13 % 5;
        int bb = 17 & 8;
        int cc = 19 % 3;  // int 19 / 3  остаток деления у нас 1
        int dd = 9 % 2; // 9 / 2 это 4;

    }
}
