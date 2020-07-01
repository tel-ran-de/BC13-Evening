package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        // myFirstInteger();
        // myFirstLong();
        byteAddition();
    }

    public static void myFirstInteger() {
        // здесь сейчас будет мой прекрасный код
        // Definition, declaration, initialization
        // Определение, объявление, инициализация переменных
        int a = 2; // присваиваем
        int b = 3;
        int c = a + b;
        System.out.println("Сумма а и б = " + c);
        int d;
        d = c * a;
    }

    public static void myFirstLong() {
        // long от -9223372036854775808 до 9223372036854775807
        // int от -2147483648 до 2147483647
        long myFirstLong = 12345678987654321L;
        long mySecondLong = 100;
        long myThirdLong = 904723954743l;
        long myForthLong = 12_345_678_987_654_321L;
        System.out.println(myForthLong);
    }

    public static void byteAddition() {
        byte a = 100;
        byte b = 35;
        byte c = (byte) (a + b);
        System.out.println("Результат" +
                " сложения а и б " +
                "в байтах у" +
                " нас равен = " + c);
        short s = 100;
    }

    public static void magic(){
        int hexValue1 = 0x100; // Шестнадцатеричная система счисления
        int binary = 0B1001_________1001; // Двоичная система счисления
        int octal =  0757;  // восьмеричная система счисления
    }
}
