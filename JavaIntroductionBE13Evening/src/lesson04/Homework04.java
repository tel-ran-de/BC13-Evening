package lesson04;

public class Homework04 {
    public static void main(String[] args) {
        //7. Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён".
        //8. Вывести на экран "Осторожно, вход воспрещён" заглавными буквами.

        String input = "Вход разрешён";
        String exercises = "воспрещён";
        String output = "";
        output = input.substring(0, input.length() - 8) + exercises;
        System.out.println(output);
        String attention = "Осторожно";

        output = attention + ", " + output;
        System.out.println(output.toUpperCase());

    }
}
