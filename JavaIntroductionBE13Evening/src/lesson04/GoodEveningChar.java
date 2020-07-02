package lesson04;

public class GoodEveningChar {
    public static void main(String[] args) {
        char c1 = 10000;
        System.out.println("мой первый символ, который 100 - " + c1);
        char c2 = '\u0440';
        System.out.println("Ожидаю увидеть букву р - " + c2);
        char c3 = '\u00A9';
        System.out.println("Попытка номер три " + c3);
        char abc = 'A';
        System.out.println("Ожидаю увидеть А -" + abc);
        char euro = '€';
        char tm = '™';
        char c4 = '\t';
        System.out.println(c1 + c2 + c3 + c4 + tm);
        System.out.println("Попытка номер 4 " + c1 + c2 + c3 + c4 + tm);
        char c5 = ' ';
    }
}
