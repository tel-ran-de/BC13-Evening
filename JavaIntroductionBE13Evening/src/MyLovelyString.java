public class MyLovelyString {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("мой стринг");
        StringBuffer myLittleStringBuffer = new StringBuffer("Мой маленький стрингбафер");
        System.out.println(myLittleStringBuffer);

        StringBuilder myVeryLittleStringBuilder = new StringBuilder("Исчо адзин");
        System.out.println(myVeryLittleStringBuilder);
        // однопоточное vs многопоточное

        for (int i = 0; i < 100; i++) {
            s1.append(i);
        }
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
