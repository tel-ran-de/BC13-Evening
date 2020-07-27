import java.util.Scanner;

public class MyLovelyScanner {
    public static void main(String[] args) {
        scannerString();
    }

    public static void scannerString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = input.next();
        System.out.println("Скажите вашу фамилию");
        String surname = input.next();
        System.out.println("А сколько вам лет?");
        int age = input.nextInt();

        System.out.println("Добро пожаловать " + name + " " + surname);
        System.out.println("В нашей базе стоит, что вам " +age+ " лет");
    }

    public static void goodEveningScanner() {
        //System.out.println("Hello  World!");
        int age;
        System.out.println("Введите ваш возраст");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

/*
        if (age >= 18) {
            System.out.println("Можете покупать спиртные напитки");
        } else System.out.println("Ничего не получишь мальчик");
*/
        String alcoPermTrue = "Можете покупать спиртные напитки";
        String alcoPermFalse = "Ничего не получишь мальчик";
        String result = (age >= 18) ? alcoPermTrue : alcoPermFalse;
        System.out.println(result);
    }
}
