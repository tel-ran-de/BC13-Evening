/**
 * JavaIntroductionBE13Evening
 * 03 11 : 09
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(perimeterRectAngle(5, 7));
        exercise3(35, 87);
    }

    public static int perimeterRectAngle(int a, int b) {
        return 2 * (a + b);
    }

    public static int squareArea(int a) {
        return a * a;
    }

    public static int perimeterSquare(int a) {
        return 4 * a;
    }

    public static double perimeterCircle(int radius) {
        return 2 * radius * Math.PI;
    }

    public static double circleSquare(int radius) {
        return Math.PI * radius * radius;
    }

    public static void exercise3(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
                System.out.println(i);
            }

        }
    }
}


