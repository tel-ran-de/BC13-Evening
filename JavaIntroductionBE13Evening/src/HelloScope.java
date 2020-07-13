
public class HelloScope {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        a = 30;
        a = 0;
        secondMethod();
    }

    public static void secondMethod() {

        int variable1 = 100;
        {
            int b = 8;
            variable1 = variable1 + b;
            System.out.println(b);
        }
        int b = 100;
        System.out.println(variable1);
        System.out.println(b);
    }

    public static void threesMethod() {
        int b = 0;
        for (int i = 0; i < 10; i++) {
            int a = 0;
            a++;
            System.out.println(a);
            b++;
        }

        for (int i = 100; i < 200; i++) {
            int a = 56;
            a--;
        }
    }
}
