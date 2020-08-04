import lessonLessThan30.MyDoubleArrayInit;

public class RandomReview {
    public static void main(String[] args) {
        //randomIntroduction();
        //randomMyDefault();
        //myRandomChar();
        myRandomBoolean();
    }

    private static void myRandomBoolean() {
        boolean b = Math.random() >= 0.5;
        System.out.println(b);
    }

    private static void myRandomChar() {
        char cRandom = (char) (Math.random() * 1000);
        System.out.println(cRandom);
    }


    private static void randomMyDefault() {
        int r = (int) (Math.random() * 100);
        System.out.println(r);
    }

    private static void randomIntroduction() {
        for (int i = 0; i < 30; i++) {
            System.out.println(MyDoubleArrayInit.myRound(Math.random()));
        }
    }
}
