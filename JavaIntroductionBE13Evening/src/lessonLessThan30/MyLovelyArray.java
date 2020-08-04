package lessonLessThan30;

public class MyLovelyArray {
    // array, массив, Feld
    public static void main(String[] args) {
        //arrayFirstDeclaration();
        //arrayInitialisation();
        germanCities();
    }

    private static void arrayFirstDeclaration() {
        int[] myArray;
        String[] users;
        String[] telran13Evening;
        double[] gpsPointsFromBerlinToMoscow;
        char[] cyrillicAlphabet;
    }

    private static void arraySecondDeclaration() {
        int myArray[];
        String users[];
        String telran13Evening[];
        double gpsPointsFromBerlinToMoscow[];
        char cyrillicAlphabet[];
        long lll = 234231524365465464l;
    }

    private static void arrayFirstInitialisation() {
        int[] field;
        field = new int[10]; // в массиве 10 ячеек
        System.out.println(field[9]);

        boolean[] truthTable = new boolean[5];
        System.out.println(truthTable[0]);

        String[] str = new String[5];
        System.out.println(str[0]);
    }

    private static void arrayInitialisation() {

        String[] fourSeasons = new String[]
                {
                        "Зима",
                        "Гостиница",
                        "Кинг",
                        "Чайковский",
                        "Вивальди",
                        "МузБанда",
                        "Зима",
                        "Гостиница",
                        "Кинг",
                        "Чайковский",
                        "Вивальди",
                        "МузБанда"
                };

        int[] fibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

    }

    public static void germanCities() {
        String[] deutscheStaedte = new String[]{
                "Berlin",
                "München",
                "Hamburg",
                "Düsseldorf",
                "Köln",
                "Frankfurt",
                "Stuttgart"
        };
        int allLetter = 0;
        int laenge = deutscheStaedte.length;
        for (int i = 0; i < laenge; i++) {
            allLetter = allLetter + deutscheStaedte[i].length();
        }
        System.out.println(allLetter);
    }
}
