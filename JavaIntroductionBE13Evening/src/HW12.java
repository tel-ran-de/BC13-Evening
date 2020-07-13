
public class HW12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        //first(a, b);
        second(5,17);
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        //Сколько раз будет выведено сообщение на экран?

    }


    public static void first(int a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }


    }

    public static void second(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println(i);

        }
    }
}
