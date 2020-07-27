
public class MyLovelyTernarOperator {
    public static void main(String[] args) {
        //test();
        test2();
    }

    private static void test2() {
        int a = 10;
        int b = 20;
        int c = (a > b) ? a : b;
        System.out.println(c);
    }

    private static void test() {
        int a = 10;
        int b = 20;
        int c = 0;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }


}
