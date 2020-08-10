/**
 * . Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
 * + при езде до 50 км/час нарушений нет;
 * + за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
 * + за превышение скорости от 16 км/час — 40 евро штрафа;
 * + за езду от 100 км/час до 130 км/час — штраф 500 евро;
 * + и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства.
 */
public class IfElseReview1 {
    public static void main(String[] args) {
        System.out.println(actionPolice(45));
        System.out.println(actionPolice(55));
        System.out.println(actionPolice(75));
        System.out.println(actionPolice(85));
        System.out.println(actionPolice(105));
        System.out.println(actionPolice(150));
    }

    public static String actionPolice(int speed) {
        String result = "";
        if (speed < 50) {
            result = result + "Нарушений нет";
        } else if (speed <= 65) {
            result = result + "устное порицание";
        } else if (speed <= 100) {
            result = result + "40 евро штрафа";
        } else if (speed <= 130) {
            result = result + "500 евро штрафа";
        } else {
            result = result + "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства.";
        }

        return "для скорости -" + speed + " " + result.toUpperCase();
    }
}
