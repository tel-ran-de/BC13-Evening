public class Review {
    public static void main(String[] args) {

        //newTest();
    }

    public static void secondTest() {
        int speed = 60;

        if (speed < 50) {
            System.out.println("Штрафа не будет");
        }else {
            System.out.println("Штраф будет");
        }
    }


    public static void newTest() {
        int i = 2;
        double d1 = 4.0;
        double d2 = 2.0;
        double d3 = 3.0;
        double d4 = i;

        d3 = d3 + d2 + d1;
        System.out.println(d3);
        d3 /= 3;
        System.out.println(d3);
        d3 = d3 / 3;
        System.out.println(d3);

        double PI = Math.PI;
        char c1 = '@';
        char c2 = 100;
        char c3 = '\u4340';
        char c4 = '/';
        System.out.println("" + c3 + c2 + c1);
        String s1 = "Вася";
        String s2 = "Васечкин";
        System.out.println(s1 + c4 + s2);
        // int, byte, short, long
        // double, float
        // char
        // boolean
        // String

        String s10 = "78.10";
        System.out.println(s10);
        double d10 = Double.parseDouble(s10);
        System.out.println(d10);

        boolean b1 = true;
        boolean b2 = false;
        boolean moscowPermission = true;
        boolean doctorPermission = false;
        boolean weatherPermission = true;
        boolean anglePermission = true;

        boolean start = moscowPermission & doctorPermission & weatherPermission & anglePermission;
        System.out.println(start);

    }
}
