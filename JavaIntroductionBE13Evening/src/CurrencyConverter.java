public class CurrencyConverter {
    /*
    Реализовать метод, который принимает название валюты
    (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к доллару.
    Естественно, “USD” возвращает 1.0
     */
    public static void main(String[] args) {
        System.out.println(converter(1000, "EUR", "RUR"));
        System.out.println(converter(1000, "usd", "byn"));

    }

    public static double converter(double amount, String inputCurrency, String outputCurrency) {
        return amount * findCourseTwoCurrency(inputCurrency, outputCurrency);
    }

    public static double findCourseTwoCurrency(String firstCurrency, String secondCurrency) {
        return findCourse(firstCurrency) / findCourse(secondCurrency);
    }

    public static double findCourse(String currencyName) {
        currencyName = currencyName.toUpperCase();
        double course = 0.0;
        switch (currencyName) {
            case "EUR":
                course = 1.13;
                break;
            case "RUR":
                course = 0.014;
                break;
            case "USD":
                course = 1;
                break;
            case "GPB":
                course = 1.26;
                break;
            case "UAH":
                course = 0.037;
                break;
            case "BYN":
                course = 0.41;
                break;
            default:
                course = 0.0;
                break;
        }
        return course;
    }
}
