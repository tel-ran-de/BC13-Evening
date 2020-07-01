package lesson03;

public class HelloDouble {
    public static void main(String[] args) {
        goodEveningDouble();
        goodEveningFloat();
        double radius = 55.5;
        double circleSquare = findSquareCircle(radius);
        System.out.println("Площадь круга " + circleSquare + " , если радиус = " + radius);

        findSquareCircleTwo();
    }

    public static void goodEveningDouble() {
        double d0 = 10.0;
        double d1 = 1000.0;
        int i1 = 10;
        double divideTest = d0 / d1;
        System.out.println("Ожидаю получить переменную double d0 = 10; - " + d0);
        System.out.println("Ожидаю получить divideTest " + divideTest);
    }

    public static void goodEveningFloat() {
        float a = 3.5F;
        float b = 4.5f;
        float c = (float) 5.5;
        float d = a + b + c;
        System.out.println("a+b+c: " + d);
    }

    public static double findSquareCircle(double radius) {
        final double PI = 3.14;
        // final - используется для "финализации" переменной,
        // теперь переменной PI нельзя присвоить другое значение.
        final double minTemp = 18.0;
        final double maxTemp = 24.0;

        double square = PI * radius * radius;

        return square;
    }

    public static void findSquareCircleTwo() {
        final double PI = 3.14;
        double radius = 7.0;
        double square = PI * radius * radius;
        System.out.println("Площадь найденная обычным способом " + square);
    }
}
