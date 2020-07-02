package lesson04;

public class LondonIsTheCapital {
    public static void main(String[] args) {
        String articleTitle = "london is the capital";
        System.out.println("1. Вариант - " + articleTitle);
        articleTitle = articleTitle.toUpperCase();
        System.out.println("2. Вариант - " + articleTitle);
        articleTitle = articleTitle.toLowerCase();
        System.out.println("3. Вариант - " + articleTitle);

        String newTitle =
                articleTitle.substring(0, 1).toUpperCase()
                        + articleTitle.substring(1).toLowerCase();
        System.out.println("4. Вариант - " + newTitle);

        newTitle = articleTitle.substring(0, 1).toUpperCase() +
                articleTitle.substring(1, 2).toLowerCase() +
                articleTitle.substring(2, 3).toUpperCase() +
                articleTitle.substring(3, 4).toLowerCase() +
                articleTitle.substring(4).toUpperCase();
        System.out.println("5. Вариант - " + newTitle);

    }
}
