public class MyFirstMain {
    public static void main(String[] args) {
        mySuperMethod(true, 25, '@', 5.6);
    }

    private static void mySuperMethod(boolean doctorPermission, int weather, char c, double speed) {
        System.out.println("Start");
    }

    public static int squareCircle(int radius) {
        return (int) (Math.PI * radius * radius);
    }
}
