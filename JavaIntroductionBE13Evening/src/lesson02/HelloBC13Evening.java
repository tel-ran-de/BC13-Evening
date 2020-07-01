package lesson02;

public class HelloBC13Evening {
    public static void main(String[] args) {
        int a = 5;
        // findSquare(a);
        //  findPerimeter();
        System.out.println(addition(3, 5));
        int x = 10;
        int y = 20;
        System.out.println(addition(x, y));
    }

    public static int addition(int a, int b) {
        int c = a + b;
        return c;
    }


    public static void findSquare(int a) {
        int square = a * a;
        System.out.println(square);
    }

    public static void findPerimeter() {
        int a = 5;
        int perimeter = 4 * a;
        System.out.println(perimeter);
    }


}
