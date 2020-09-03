import java.util.Arrays;

public class TryAndCry {
    public static void main(String[] args) {
/*        int[] array = new int[5];

        array[1] = 15;
        int b = array[1];
        System.out.println(b);
        System.out.println(Arrays.toString(array));

        int element = array[5];
        System.out.println(element);*/
        simpleTest();
    }

    private static void simpleTest() {
        int[] array = new int[5];
        try {
            int element = array[5];
            // скорее всего этот код не выполнится, потому что здесь ошибка
            System.out.println("Я НИКОГДА НЕ УВИЖУ ТЕРМИНАЛ");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Разработчик лови ошибку ArrayIndexOutOfBoundsException №456");
        } finally {
            System.out.println("Была ошибка или нет, я выполнюсь. Например рестарт всего приложения");
        }

    }
}
