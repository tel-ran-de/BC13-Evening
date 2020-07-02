package lesson04;

public class ReviewAndHomeWorkFromLesson04 {
    public static double findCircumference(double radius) {
        final double PI = Math.PI;
        return 2 * PI * radius;
    }

    public static double currencyConverterEuroToDollars(double euro) {
        double dollars;
        double currencyConst = 1.1;
        dollars = euro * currencyConst;
        return dollars;
    }

    public static double currencyConverterDollarsToEuro(double dollars) {
        double euro;
        double currencyConst = 1.1;
        euro = dollars / currencyConst;
        System.out.println(euro);
        return euro;
    }

    public static double relationBelarusToUkraine() {
        double relation = 0.0;
        double belarusSquare = 207595;
        double ukraineSquare = 603628;
        relation = belarusSquare / ukraineSquare;
        return relation;
    }

    public static double relationSquareOneToSquareTwo(double s1, double s2) {
        return s1 / s2;
    }

    public static double bankPercent(int year, double perCent, double amount) {
        return amount + amount * perCent * year / 100;
    }
}
