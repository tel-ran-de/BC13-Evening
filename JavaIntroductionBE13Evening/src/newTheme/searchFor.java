package newTheme;

public class searchFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("Здесь наше условие выполняется");
                break;
            }
            System.out.println("Значение i - " + i);
        }
        System.out.println("Цикл завершен");
    }
}
