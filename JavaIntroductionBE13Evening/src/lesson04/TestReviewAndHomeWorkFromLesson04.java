package lesson04;

public class TestReviewAndHomeWorkFromLesson04 {
    public static void main(String[] args) {
        double length = ReviewAndHomeWorkFromLesson04.findCircumference(15);
        System.out.println("Длина окружности, посчитанная в ReviewAndHomeWorkFromLesson04  " + length);
        double pi = Math.PI;

        double currency = 500;
        System.out.println("доллары в евро 500  -   "
                + ReviewAndHomeWorkFromLesson04
                .currencyConverterDollarsToEuro(currency));
        System.out.println(
                ReviewAndHomeWorkFromLesson04
                        .currencyConverterEuroToDollars(currency));

        System.out.println("ReviewAndHomeWorkFromLesson04.relationBelarusToUkraine() "
                + ReviewAndHomeWorkFromLesson04.relationBelarusToUkraine());

        System.out.println("Москва к Берлину " + ReviewAndHomeWorkFromLesson04.relationSquareOneToSquareTwo(2511, 891));

        int year = 7;
        double percent = 3.5;
        double amount = 1000;
        System.out.println("Пожалуйста посчитай всё правильно  " + ReviewAndHomeWorkFromLesson04.bankPercent(year, percent, amount));


    }
}
