public class HomeWork12 {
    public static void main(String[] args) {
        //first(5, 3);
        //second(5, 17);
        five("*", 10);
    }

    public static void first(int a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    public static void second(int a, int b) {
        for (int i = a; i <= b; i ++) {
            System.out.println(i);
        }
    }

    public static void five(String divide, int n){
        String line = "";
        for (int i = 0; i < 10; i++) {
            line = divide + line;
            System.out.println(line);
        }
    }
}
