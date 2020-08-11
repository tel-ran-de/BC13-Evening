public class HomeWork33 {
    public static void main(String[] args) {
        System.out.println(trafficPolice(45));
        System.out.println(trafficPolice(55));
        System.out.println(trafficPolice(75));
        System.out.println(trafficPolice(85));
        System.out.println(trafficPolice(105));
        System.out.println(trafficPolice(150));
        System.out.println(chooseVitjaz(1));//"Коня потряешь"
        System.out.println(chooseVitjaz(2));//"Жизнь потеряешь"
        System.out.println(chooseVitjaz(3)); //"Жив будешь, да себя позабудешь"
        System.out.println(trafficSignals("Зеленый")); //ЗЕЛЕНЫЙ СИГНАЛ разрешает движение
        System.out.println(trafficSignals("Желтый")); //ЖЕЛТЫЙ СИГНАЛ запрещает движение и предупреждает о предстоящей смене сигналов
        System.out.println(trafficSignals("Красный")); //КРАСНЫЙ СИГНАЛ, в том числе мигающий, запрещает движение
        System.out.println(moneyAparat(3));
        System.out.println(moneyAparat(5));
        System.out.println(moneyAparat(10));
        System.out.println(moneyAparat(15));
        System.out.println(moneyAparat(1));
        System.out.println(dateDisplay(5, 6, 2020, "-"));
        System.out.println(dateDisplay(50, 40, 2020, "-"));
    }
    private static String dateDisplay(int d, int m, int y, String delimeter) {
        String day, month, year = "";
        if (d < 1 || d > 31) {
            return "error";
        } else if (d < 10) {
            day = "0" + d;
        } else {
            day = String.valueOf(d);
        }
        if (m < 1 || m > 12) {
            return "error";
        } else if (m < 10) {
            month = "0" + m;
        } else {
            month = String.valueOf(m);
        }
        if (y < 1) {
            return "error";
        } else {
            year = String.valueOf(y);
        }
        return day + delimeter + month + delimeter + year;
    }
    private static int moneyAparat(int experience) {
        int sallary = 500;
        if (experience >= 3 && experience < 5) {
            sallary = (int) (sallary * 1.10);
        } else if (experience >= 5 && experience < 10) {
            sallary = (int) (sallary * 1.5);
        } else if (experience >= 10 && experience < 15) {
            sallary = (sallary * 2);
        } else if (experience >= 15) {
            sallary = (int) (sallary * 2.5);
        }
        return sallary;
    }
    private static String trafficSignals(String color) {
        String outcome = "";
        switch (color) {
            case "Зеленый":
                outcome = outcome + "разрешает движение";
                break;
            case "Желтый":
                outcome = outcome + "запрещает движение и предупреждает о предстоящей смене сигналов";
                break;
            case "Красный":
                outcome = outcome + "запрещает движение";
                break;
        }
        return "Если - " + color + " " + outcome;
    }
    private static String chooseVitjaz(int way) {
        String result = "";
        if (way == 1) {
            result = result + "Коня потряешь";
        } else if (way == 2) {
            result = result + "Жизнь потеряешь";
        } else if (way == 3) {
            result = result + "Жив будешь, да себя позабудешь";
        }
        return "Если - " + way + " " + result.toUpperCase();
    }
    private static String trafficPolice(int speed) {
        String result = "";
        if (speed < 50) {
            result = result + "Нарушений нет";
        } else if (speed <= 65) {
            result = result + "Устное порицание и лекция на 5 минут";
        } else if (speed <= 100) {
            result = result + "40 евро штрафа";
        } else if (speed <= 130) {
            result = result + "Штраф 500 евро";
        } else {
            result = result + "Штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства";
        }
        return "для скорости - " + speed + " " + result;
    }
}


