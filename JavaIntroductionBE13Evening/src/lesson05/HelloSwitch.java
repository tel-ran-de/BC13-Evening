package lesson05;

import org.w3c.dom.ls.LSOutput;

/**
 * За пятёрку в четверти по математике папа обещал мне велосипед.
 * За четвёрку в четверти по математике мама купит мне GoPro4.
 * За тройку меня, наверное, не будут ругать.
 * За двойку меня отругают.
 * За единицу меня "убьют".
 */
public class HelloSwitch {
    public static void main(String[] args) {
        int quarterlyAssessment = 1;
        System.out.println("Если единица - " + findQuarterlyAssessment(quarterlyAssessment));
        System.out.println("Если пятёрка - " + findQuarterlyAssessment(5));

    }

    public static String findQuarterlyAssessment(int note) {
        String prize = "";

        switch (note) {
            case 5:
                prize = "Велосипед";
                break;
            case 4:
                prize = "GoPro";
                break;
            case 3:
                prize = "Награды не будет";
                break;
            case 2:
                prize = "Потерянный час времени и очень плохое настроение!";
                break;
            case 1:
                prize = "Лучше и не спрашивайте";
                break;
            default:
                prize = "Такой оценки не существует";
                break;
        }
        return prize;
    }
}
