package review36;

public class MyLovelyPrimitives {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        String s = "Java - ";
        char c = 'Ж';
        //System.out.println(a + c + s);
        //System.out.println(s + c + a);
        double d = 3.14;
        d = d + a;
        System.out.println(d);
        b = (int) (d + b);
        System.out.println(b);
    }
}
