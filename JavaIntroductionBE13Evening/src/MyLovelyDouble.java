public class MyLovelyDouble {
    public static void main(String[] args) {
        //goodEveningDouble();
        //myRound();
        myRandom();
    }

    private static void myRandom() {
        double r = Math.random();
        System.out.println(r);
        int randomizer = (int) (Math.random()*100);
        System.out.println(randomizer);
    }

    private static void myRound() {
        double d = Math.PI;
        System.out.println(Math.round(d));  // математическое, школьное округление
        System.out.println(Math.floor(d)); // округление к целому меньшему числу. как кастануть в инт
        System.out.println(Math.ceil(d));  // округление к большему целому.

        double f1 = 2.7;
        System.out.println(Math.round(f1));
        System.out.println(Math.floor(f1));
    }

    private static void goodEveningDouble() {
        double d = 5;
        float f1 = (float) 3.56;
        float f2 = 5.67f;
        float f3 = 6.57F;

        int a = 5;
        System.out.println(d);

        double result = Math.pow(a, d);
        System.out.println(result);
    }
}
