package lesson05;

public class HelloBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c;
        int i1 = 5;
        int i2 = 9;

        c = i1 > i2;

        i1 = 100;
        c = i1 > i2;

        //System.out.println(c);
        helloBoolean();
    }

    public static void helloBoolean() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        System.out.println("(7 + 8) * 5 > 7 + 8 * 5  " + a);

        boolean b = (7 + 8) * 4 != 7 + 4 * 5;
        System.out.println("(7 + 8) * 4 != 7 + 4 * 5;" + b);
        int aaaa = 10;
        boolean dddddd = !b;
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4;
        System.out.println("3 + 4 > 9 + 1 & 16 - 5 > 3 * 4" + c);

        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;
        boolean f = !(3 * 4 < 7 + 8);

        // junior  начинающий программист
        //  middle опытный программист
        // senior  бригадир
        // solution architect  // team lead

    }
}
