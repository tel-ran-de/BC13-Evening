public class HomeWork07 {
    public static void main(String[] args) {
        /*1. Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        + при езде до 50 км/час нарушений нет;
        + за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        + за превышение скорости от 16 км/час — 40 евро штрафа;
        + за езду от 100 км/час до 130 км/час — штраф 500 евро;
        + и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства.
        2. Напишите программу, которая объяснит наступление определённых событий, в зависимости от выбора "витязя".
        3. Напишите программу для машины на светофоре. Что делать, если горит красный, жёлтый или зелёный свет.
        4. Напишите программу выдачи денег работнику с учётом надбавки за стаж,
        если базовая зарплата 500$. За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
        за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
        5. Метод вывода даты на экран монитора принимает 3 целочисленных значения(день, месяц, год)
         и разделитель (например "-"). Проверить значения данных на адекватность, и если надо дописать нули.
        - 5.6.2020 должно быть выведено на экран как "05-06-2020"
                - 50.40.2020 не должно быть выведено вообще */

        //System.out.println(actionPolice(45));//"нарушений нет"
        //System.out.println(actionPolice(55));//"устное порицание"
        //System.out.println(actionPolice(75));//"40 евро штраф"
        //System.out.println(actionPolice(85));//"50 евро штраф"
        //System.out.println(actionPolice(95));//"100 евро штраф"


        //System.out.println(chooseVitjazj(1));//"Пропадешь"
        //System.out.println(chooseVitjazj(2));//"Коня потеряешь"
        //System.out.println(chooseVitjazj(3));//"Бабу Ягу в жены возмешь"

        //System.out.println(traficLights(1));//"STOP!"
        //System.out.println(traficLights(2));//"Приготовиться!"
        //System.out.println(traficLights(3));//"Поехали!"

        //System.out.println(salary(500, 3, 10));//"премия 10%"-1650
        //System.out.println(salary(500, 5, 50));//"премия 50%"-3750
        //System.out.println(salary(500, 10, 100));//"премия 100%"-10000
        //System.out.println(salary(500, 15, 150));//"премия 150%"-18750

        System.out.println(date(5, 6, 2));//"05-06-2020"

    }

    public static String actionPolice(int speed) {
        String result = "Внимание!";
        if (speed <= 50) {
            result = result + " " + "нарушений нет";
        } else if (speed <= 65) {
            result = result + " " + "устное порицание";
        } else if (speed <= 80) {
            result = result + " " + "40 евро штраф";
        } else if (speed <= 90) {
            result = result + " " + "50 евро штраф";
        } else if (speed <= 100) {
            result = result + " " + "100 евро штраф";
        }
        return result;
    }


    public static String chooseVitjazj(int way) {
        if (way == 1) {
            return "Ответ компьютера" + "Пропадешь";
        } else if (way == 2) {
            return "Коня потеряешь";
        } else if (way == 3) {
            return "Бабу Ягу в жены возмешь";
        }

        return " ";

    }

    public static String traficLights(int a) {
        if (a == 1) {
            return "STOP!";
        } else if (a == 2) {
            return "Приготовиться!";
        } else if (a == 3) {
            return "Поехали!";
        }

        return " ";

    }

    public static int salary(int a, int b, int c) {
        return ((a * b) + (a * c / 100 * b));
    }

    public static String date(int a, int b, int c) {
        String s = "-";
        String z = "0";
        int d = 0;

        return ("0" + a + "-" + d + b + "-" + c + "0" + c + "0");
    }

}
