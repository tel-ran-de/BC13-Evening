public class MyLovelyWhile {
    public static void main(String[] args) {
        myFor();
        //myWhile();
        //myDoWhile();
    }

    private static void myDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 20);
    }

    private static void myWhile() {
        int i = 0;
        while (i < 20) {
            for (int k = 0; k < 10; k++) {
                do {
                    System.out.println(i);
                    i++;
                } while (i < 20);
            }
        }
    }

    private static void myFor() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(i);
                }
            }
        }
    }
}
