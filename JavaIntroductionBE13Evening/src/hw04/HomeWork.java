package hw04;

/**
 * Вывести на экран построчно анкетные данные:
 * Имя, Фамилия, Адрес, Улица и тд и тп. Пример вывода одной строчки:
 * <p>
 * Имя пользователя: Андрей
 * Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён".
 * Вывести на экран "Осторожно, вход воспрещён" заглавными буквами.
 */
public class HomeWork {
    public static void main(String[] args) {
        //exercisesUno();
        System.out.println(exercisesDos().toUpperCase());
    }

    public static String exercisesDos() {
        String input1 = "Вход разрешён";
        int clientInt = 8;
        String input2 = "воспрещён";
        String input3 = "Осторожно, ";
        String result = "";
        int input1Length = input1.length();

        String myString = "Самое длинное предложение в мире";
        int dlina = myString.length();

        int output5 = input1Length - clientInt;

        String output1 = input1.substring(0, output5);

        result = input3 + output1 + input2;

        return result;
    }


    public static void exercisesUno() {
        System.out.println("Имя: Сидоров");
        System.out.println("Фамилия: Варфаломей");
        System.out.println("Адрес: Зауралье");
    }
}

